public class Krug {

    private String naziv = "Krug";
    private double radijus;

    public Krug(double radijus) {
        this.radijus = radijus;
    }

    public String getNaziv() {
        return naziv;
    }

    public double izracunajPovrsinu() {
        return Math.PI * radijus * radijus;
    }

    public double izracunajOpseg() {
        return 2 * Math.PI * radijus;
    }
}
