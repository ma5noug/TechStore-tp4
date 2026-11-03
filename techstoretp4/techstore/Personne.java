public class Personne {
    private String cin;
    private String nom;
    private String prenom;
    private Adresse adresse;
    public Personne(String cin, String nom, String prenom, Adresse adresse) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse =adresse;
    }
    public Personne(String cin, String nom, String prenom, String gouvernorat, int codepostal) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse =new Adresse(gouvernorat,codepostal);
    }
    public void setCin(String cin) {
        this.cin = cin;
    }
    public String getCin() {
        return cin;
    }
    public String setNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public Adresse getAdresse() {
        return adresse;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
    public String toString() {
        return "cin=" + cin + ",nom=" + nom + ",prenom=" + prenom + ", " + this.adresse.toString();
    }
}
