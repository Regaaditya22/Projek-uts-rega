public class Main {
    public static void main(String[] args) {
        Hewan h1 = new Kucing("Garfield", 5);
        Hewan h2 = new Anjing("Lucky", 3);
        Hewan h3 = new Burung("Tweety", 2);

        System.out.println("**Hewan 1:**"); // Gunakan tanda bintang untuk judul
        System.out.println("Nama: " + h1.getNama());
        System.out.println("Usia: " + h1.getUsia());
        h1.bersuara();

        System.out.println("\n**Hewan 2:**"); // Gunakan tanda bintang untuk judul
        System.out.println("Nama: " + h2.getNama());
        System.out.println("Usia: " + h2.getUsia());
        h2.bersuara();

        System.out.println("\n**Hewan 3:**"); // Gunakan tanda bintang untuk judul
        System.out.println("Nama: " + h3.getNama());
        System.out.println("Usia: " + h3.getUsia());
        h3.bersuara();
    }
}
