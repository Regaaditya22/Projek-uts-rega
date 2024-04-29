public class Kucing extends Mamalia {
    public Kucing(String nama, int usia) {
        super(nama, usia);
    }

    @Override
    public void bersuara() {
        System.out.println("Meow!");
    }
}
