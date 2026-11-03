import java.util.ArrayList;

public class Stock {
    private ArrayList<Element> articleList;

    public Stock() {
        this.articleList = new ArrayList<Element>();
    }

    public Stock(ArrayList<Element> articleList) {
        this.articleList = articleList == null
                ? new ArrayList<Element>()
                : articleList;
    }

    public Stock(ArrayList<String> noms, ArrayList<Double> prix, ArrayList<Long> quantites) {
        this();
        if (noms == null || prix == null || quantites == null) {
            throw new IllegalArgumentException("Les listes ne doivent pas etre nulles.");
        }
        if (noms.size() != prix.size() || noms.size() != quantites.size()) {
            throw new IllegalArgumentException(
                    "Les listes de noms, de prix et de quantites doivent avoir la meme taille.");
        }
        for (int i = 0; i < noms.size(); i++) {
            String nom = noms.get(i);
            Article article = new Article(
                    i,
                    nom,
                    Article.genererReference(nom),
                    prix.get(i));
            articleList.add(new Element(article, quantites.get(i)));
        }
    }

    public ArrayList<Element> getArticleList() {
        return articleList;
    }

    public int getArticleNb() {
        return articleList.size();
    }

    public void setArticleList(ArrayList<Element> articleList) {
        this.articleList = articleList == null
                ? new ArrayList<Element>()
                : articleList;
    }

    public void ajouterArticle(Article article, long quantite) {
        articleList.add(new Element(article, quantite));
    }

    public void ajouterArticle(String nom, double prix, long quantite) {
        Article article = new Article(
                articleList.size(),
                nom,
                Article.genererReference(nom),
                prix);
        ajouterArticle(article, quantite);
    }

    public Element trouverArticle(String reference) {
        if (reference == null) {
            return null;
        }
        for (Element element : articleList) {
            if (element != null && reference.equals(element.getReferenceArticle())) {
                return element;
            }
        }
        return null;
    }

    public boolean modifierArticle(String reference, String nom, double prix, long quantite) {
        Element element = trouverArticle(reference);
        if (element != null) {
            element.modifierArticle(nom, prix, quantite);
            return true;
        }
        return false;
    }

    public boolean supprimerArticle(String reference) {
        Element element = trouverArticle(reference);
        if (element != null) {
            articleList.remove(element);
            return true;
        }
        return false;
    }

    public boolean incrementerQuantiteArticle(String reference, long quantite) {
        Element element = trouverArticle(reference);
        if (element != null) {
            element.incrementerQuantite(quantite);
            return true;
        }
        return false;
    }

    public boolean decrementerQuantiteArticle(String reference, long quantite) {
        Element element = trouverArticle(reference);
        if (element != null) {
            element.decrementerQuantite(quantite);
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder resultat = new StringBuilder();
        for (int i = 0; i < articleList.size(); i++) {
            if (i > 0) {
                resultat.append(System.lineSeparator());
            }
            resultat.append(articleList.get(i));
        }
        return resultat.toString();
    }
}
