import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int brojacKrug = 1;
        int brojacTrokut = 1;
        int brojacPravokutnik = 1;
        Scanner sc = new Scanner(System.in);
        ArrayList<GeometrijskiLik> generiraniLikovi = new ArrayList<>();

        int izbor;

        do {
            System.out.println("\n1 - Dodaj Trokut");
            System.out.println("2 - Dodaj Krug");
            System.out.println("3 - Dodaj Pravokutnik");
            System.out.println("4 - Ispisi sve");
            System.out.println("5 - Sortiraj po povrsini (uzlazno)");
            System.out.println("0 - Izlaz");

            System.out.print("Odabir: ");
            izbor = sc.nextInt();
            sc.nextLine();

            switch (izbor) {

                case 1:
                    System.out.print("a: ");
                    double a = sc.nextDouble();
                    System.out.print("b: ");
                    double b = sc.nextDouble();
                    System.out.print("c: ");
                    double c = sc.nextDouble();
                    sc.nextLine();

                    String nazivTrokuta = "Trokut" + brojacTrokut++;
                    generiraniLikovi.add(new Trokut(a, b, c, nazivTrokuta));
                    break;
                case 2:
                    System.out.print("Radijus: ");
                    double r = sc.nextDouble();
                    sc.nextLine();

                    String nazivKruga = "Krug" + brojacKrug++;
                    generiraniLikovi.add(new Krug(r, nazivKruga));
                    break;

                case 3:
                    System.out.print("a: ");
                    double pa = sc.nextDouble();
                    System.out.print("b: ");
                    double pb = sc.nextDouble();
                    sc.nextLine();

                    String nazivPrav = "Pravokutnik" + brojacPravokutnik++;
                    generiraniLikovi.add(new Pravokutnik(pa, pb, nazivPrav));
                    break;

                case 4:
                    for (GeometrijskiLik g : generiraniLikovi) {
                        System.out.println(g);
                    }
                    break;

                case 5:
                    Collections.sort(generiraniLikovi);
                    System.out.println("Sortirano!");
                    for (GeometrijskiLik g : generiraniLikovi) {
                        System.out.println(g);
                    }
                    break;

                case 0:
                    System.out.println("Izlaz.");
                    break;

                default:
                    System.out.println("Neispravan unos.");
            }

        } while (izbor != 0);

        sc.close();
    }
}