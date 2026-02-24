public class Pravokutnik extends GeometrijskiLik {

    private double a;
    private double b;

    public Pravokutnik(double a, double b, String naziv) {
        super(naziv);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double opseg() {
        return 2 * (a + b);
    }

    @Override
    public double povrsina() {
        return a * b;
    }
}