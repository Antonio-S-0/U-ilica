import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("KRUG");
        System.out.print("Radijus: ");
        double r = sc.nextDouble();
        Krug krug = new Krug(r);

        System.out.println("Povrsina: " + krug.izracunajPovrsinu());
        System.out.println("Opseg: " + krug.izracunajOpseg());

        System.out.println("PRAVOKUTNIK");
        System.out.print("Stranica a: ");
        double a = sc.nextDouble();

        System.out.print("Stranica b: ");
        double b = sc.nextDouble();

        Pravokutnik pravokutnik = new Pravokutnik(a, b);

        System.out.println("Povrsina: " + pravokutnik.izracunajPovrsinu());
        System.out.println("Opseg: " + pravokutnik.izracunajOpseg());


        System.out.println("TROKUT");
        System.out.print("Stranica a: ");
        double t1 = sc.nextDouble();

        System.out.print("Stranica b: ");
        double t2 = sc.nextDouble();

        System.out.print("Stranica c: ");
        double t3 = sc.nextDouble();

        Trokut trokut = new Trokut(t1, t2, t3);

        System.out.println("Povrsina: " + trokut.izracunajPovrsinu());
        System.out.println("Opseg: " + trokut.izracunajOpseg());

        sc.close();
    }
}
