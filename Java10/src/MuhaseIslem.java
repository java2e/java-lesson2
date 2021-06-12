public class MuhaseIslem implements Islem2<Integer> {

    public int sayi1;
    public int sayi2;

    @Override
    public Integer toplam() {
        return sayi1+sayi2;
    }

    @Override
    public Integer cikarma() {
        return Math.abs(sayi1-sayi2);
    }
}
