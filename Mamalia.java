public class Mamalia extends Hewan {
    public Mamalia(String nama, int usia) {
        super(nama, usia);
    }

    @Override
    public void bersuara() {
        System.out.println("Mamalia bersuara");
    }
}
