public class Pravokutnik {

    private String naziv = "Pravokutnik";
    private double a;
    private double b;

    public Pravokutnik(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public String getNaziv() {
        return naziv;
    }

    public double izracunajPovrsinu() {
        return a * b;
    }

    public double izracunajOpseg() {
        return 2 * (a + b);
    }
}
