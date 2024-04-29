public class Anjing extends Mamalia {
    public Anjing(String nama, int usia) {
        super(nama, usia);
    }

    @Override
    public void bersuara() {
        System.out.println("Woof!");
    }
}
