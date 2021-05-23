import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {

    /*
    Map -> Key - Value
    1- Adana
    2- Adıyaman

     */


    public static void main(String[] args) {

        HashMap<Integer,String> mapListe = new HashMap<>(); // key var
        List<String> liste= new ArrayList<>(); // key yok index var!
        mapListe.put(1,"Adana");
        mapListe.put(2,"Adıyaman");

        mapListe.size();

        // mapListe.clear();

        mapListe.get(1); //=> value

        mapListe.entrySet().stream().forEach(s-> System.out.println(s.getValue()));

        mapListe.forEach((k,v) -> System.out.println("Key :"+k+" Value :"+v));


        HashMap<Ogrenci,List<String>> ogrenciDersler =new HashMap<>();

        Ogrenci ogrenci = new Ogrenci(1,"Java");

        List<String> dersler = new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("Kimya");

        ogrenciDersler.put(ogrenci,dersler);

        ogrenciDersler.get(ogrenci); // List<String>

        ogrenciDersler.get(ogrenci).forEach(s-> System.out.println(s));

        ogrenciDersler.forEach((K,V)-> System.out.println("Key :"+K+" Value :"));

    }

}
