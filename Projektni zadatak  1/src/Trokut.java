public class Trokut extends GeometrijskiLik {

    private double a;
    private double b;
    private double c;

    public Trokut(double a, double b, double c, String naziv) {
        super(naziv);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() { return a; }
    public void setA(double a) { this.a = a; }

    public double getB() { return b; }
    public void setB(double b) { this.b = b; }

    public double getC() { return c; }
    public void setC(double c) { this.c = c; }

    @Override
    public double opseg() {
        return a + b + c;
    }

    @Override
    public double povrsina() {
        double s = opseg() / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}