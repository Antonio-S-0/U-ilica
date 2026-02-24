public abstract class GeometrijskiLik {

    private String naziv;

    public abstract double opseg();
    public abstract double povrsina();

    public GeometrijskiLik(String naziv) {
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
}