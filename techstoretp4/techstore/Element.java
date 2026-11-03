public class Element {
    private Article article;
    private long quantite;
    public Element(Article article, long quantite) {
        this.article = article;
        this.quantite = quantite;
    }
    public Element(int id, String nom, String refrence, double prix , long quantite) {
        this.article = new Article(id, nom, refrence, prix);
        this.quantite = quantite;
    }
    public Article getArticle() {
        return article;
    }
    public long getQuantite() {
        return quantite;
    }
    public String getReferenceArticle() {
        return article.getRefrence();
    }
    public String getNomArticle() {
        return article.getNom();
    }
    public void setArticle(Article article) {
        this.article = article;
    }
    public void setQuantite(long quantite) {
        this.quantite = quantite;
    }
    public void incrementerQuantite(long quantite) {
        this.quantite += quantite;
    }
    public void decrementerQuantite(long quantite) {
        this.quantite -= quantite;
    }
    public void modifierArticle(String nom,double prix, long quantite) {
        this.article = new Article(0, nom, Article.genererReference(nom), prix);
        this.quantite = quantite;
    }

    public boolean equals(String reference) {
        return this.article != null
                && this.article.getRefrence() != null
                && this.article.getRefrence().equals(reference);
    }
 
    public boolean equals(Article article) {
    return article != null && this.article != null && this.article.getRefrence() != null
            && this.article.getRefrence().equals(article.getRefrence());
}
    public String toString() {
        return "Element[article=" + article.toString() + ",quantite=" + quantite + "]";
    }

}
