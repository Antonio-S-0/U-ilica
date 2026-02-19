public class Trokut {

    private String naziv = "Trokut";
    private double a;
    private double b;
    private double c;

    public Trokut(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getNaziv() {
        return naziv;
    }

    public double izracunajOpseg() {
        return a + b + c;
    }

    public double izracunajPovrsinu() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
