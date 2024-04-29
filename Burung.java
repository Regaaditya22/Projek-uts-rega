public class Burung extends Hewan {
    public Burung(String nama, int usia) {
        super(nama, usia);
    }

    @Override
    public void bersuara() {
        System.out.println("Kicau!");
    }
}