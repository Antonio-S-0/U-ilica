public abstract class GeometrijskiLik implements Comparable<GeometrijskiLik> {

    private String naziv;

    public GeometrijskiLik(String naziv) {
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public abstract double opseg();
    public abstract double povrsina();

    @Override
    public int compareTo(GeometrijskiLik other) {
        return Double.compare(this.povrsina(), other.povrsina());
    }

    @Override
    public String toString() {
        return "Naziv: " + naziv +
                ", Povrsina: " + povrsina() +
                ", Opseg: " + opseg();
    }
}