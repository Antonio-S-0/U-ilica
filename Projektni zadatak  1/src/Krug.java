public class Krug extends GeometrijskiLik {

    private double radijus;

    public Krug(double radijus, String naziv) {
        super(naziv);
        this.radijus = radijus;
    }

    public double getRadijus() {
        return radijus;
    }

    public void setRadijus(double radijus) {
        this.radijus = radijus;
    }

    @Override
    public double opseg() {
        return 2 * Math.PI * radijus;
    }

    @Override
    public double povrsina() {
        return Math.PI *Math.pow(radijus,2);
    }
}