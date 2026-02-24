public class Main {
    public static void main(String[] args) {

        Krug k = new Krug(10, "Krug1");
        System.out.println("Naziv: " + k.getNaziv());
        System.out.println("Opseg: " + k.opseg());
        System.out.println("Povrsina: " + k.povrsina());

        Pravokutnik p = new Pravokutnik(4, 6, "Prav1");
        System.out.println("\nNaziv: " + p.getNaziv());
        System.out.println("Opseg: " + p.opseg());
        System.out.println("Povrsina: " + p.povrsina());

        Trokut t = new Trokut(3, 4, 5, "Trokut1");
        System.out.println("\nNaziv: " + t.getNaziv());
        System.out.println("Opseg: " + t.opseg());
        System.out.println("Povrsina: " + t.povrsina());
    }
}