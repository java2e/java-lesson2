import java.util.HashMap;

public class Example3 {

    public static void main(String[] args) {

        HashMap<Integer,String> mapListe= new HashMap();
        mapListe.put(123,"Fuat");
        mapListe.put(1234,"Java");
        mapListe.get(123); // Fuat
        mapListe.size(); // boyut veriri 2 verir
        mapListe.isEmpty(); // false
        //mapListe.clear();
        mapListe.keySet(); // Bütün keyleri HashSet verir
        //mapListe.remove(123); // Fuat siler
        mapListe.values(); // map içindeki value verir Fuat Java bir collection Arraylist olarak veriri
        mapListe.keySet().stream().forEach(s-> System.out.println(mapListe.get(s)));


    }
}
