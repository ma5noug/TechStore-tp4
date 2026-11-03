public class Adresse {
    private String gouvernoat;
    private int codepostal;

    public Adresse(String gouv, int codep) {
        this.gouvernoat = gouv;
        this.codepostal = codep;
    }

    public String getGouvernoat() {
        return gouvernoat;
    }

    public int getCodepostal() {
        return codepostal;
    }

    public void setGouvernoat(String gouv) {
        this.gouvernoat = gouv;
    }

    public void setCodepostal(int codep) {
        this.codepostal = codep;
    }
    public String toString() {
        return "adresse[gouvernoat=" + gouvernoat + ",codepostal=" + codepostal + "]";
    }
}
