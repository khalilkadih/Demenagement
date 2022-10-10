public class Objet implements Portable {
    private static int currentId=1;

    private int objetId;
    private String nom;

    public Objet(){}

    public Objet( String nom) {
        this.objetId=currentId++;
        this.nom = nom;
    }

    public int getObjetId() {
        return objetId;
    }

    public void setObjetId(int objetId) {
        this.objetId = objetId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public void afficher() {

        System.out.println("Portable " +this.getNom());

    }

    @Override
    public boolean trouver(String nomObjets) {
        return nom.equals(nomObjets);
    }

    @Override
    public String toString() {
        return "{" +
                "'objetId':'" + objetId + '\'' +
                ", 'nom':'" + nom + '\'' +
                '}';
    }
}
