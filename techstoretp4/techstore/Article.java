public class Article {
    private int id;
    private String nom;
    private String refrence;
    private double prix;
    public Article(int id, String nom, String refrence, double prix) {
        this.id = id;
        this.nom = nom;
        this.refrence = genererReference(nom);
        this.prix = prix;
    }
    static String genererReference(String nom) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < nom.length(); i += 5) {
    char c = nom.charAt(i);
    if (c != ' ') {
    sb.append(c);
    }
    }
    return sb.toString();
 }
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getRefrence() {
        return refrence;
    }
   
    public double getPrix() {
        return prix;
    }
    public void setRefrence(String refrence) {
        this.refrence =genererReference(this.nom);
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public void modifier(String nom) {
        this.nom = nom;
        this.refrence = genererReference(this.nom);
    }
    public void modifier2(String nom,double prix) {
        this.nom = nom;
        this.prix = prix;
        this.refrence = genererReference(this.nom);
    }

    public boolean equals(Article article) {
        return article != null
                && refrence != null
                && refrence.equals(article.refrence);
    }

    public String toString() {
        return "id=" + id + ",nom=" + nom + ",refrence=" + refrence + ",prix=" + prix;
    }
}
