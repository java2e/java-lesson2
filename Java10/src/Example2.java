import java.util.HashSet;

public class Example2 {

    public static void main(String[] args) {

        HashSet<String> setListe = new HashSet<>();
        setListe.add("Java"); // cıkartır
        setListe.add("Java"); // ekler
        setListe.remove("Java");
        setListe.size(); // kac tane eleman avar
        setListe.isEmpty(); // bos mu dolu mu
        setListe.clear(); // set listesini temizler
        setListe.contains("Java"); // var mı yokmu true false
        setListe.add("Java");
        setListe.add("Test");
        for (String s:setListe) {
            System.out.println(s);
        }

        setListe.stream().forEach(s-> System.out.println(s));

    }
}
