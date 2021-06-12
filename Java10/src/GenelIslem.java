public class GenelIslem implements Islem2<String> {

    public double s1;
    public double s2;

    @Override
    public String toplam() {
        double sonuc = s1+s2;
        return "Sonuc :"+sonuc;
    }

    @Override
    public String cikarma() {
        double sonuc = Math.abs(s1-s2);
        return "Sonuc :"+sonuc;
    }
}
