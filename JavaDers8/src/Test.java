import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    /*

        Set<?>



     */

    public static void main(String[] args) {

        List<String> liste = new ArrayList<>();
        liste.add("Adana");
        liste.add("Adana");
        System.out.println(liste.size()); // 2

        HashSet<Ogrenci> setListe = new HashSet<>();

        Ogrenci ogrenci2 = new Ogrenci(2,"Python");
        setListe.add(ogrenci2);
        Ogrenci ogrenci3 = new Ogrenci(3,"C#");
        setListe.add(ogrenci3);
        Ogrenci ogrenci1 = new Ogrenci(1,"Java");
        setListe.add(ogrenci1);

        setListe.stream().forEach(s-> System.out.println(s));


        System.out.println(setListe.size()); // 1

        /*
        Öğrenci listesi TCNO


        Rastgele 6 tane 1 ila 100 arasında birbirinden farklı sayıyı
        kac kez turlayarak doldurur???
         */



        HashSet<Integer> listeSayi = new HashSet<>();
        int count=0;
        while (true)
        {
            count++;

            int number = (int) (Math.random()*6);

            listeSayi.add(number);

            if (listeSayi.size() == 6)
                break;

        }

        System.out.println("Count :"+count);

        for (int s:listeSayi)
            System.out.println(s);


        /*
        Java Lambda Expression
         */
        List<Integer> l = listeSayi.stream().map(m -> m*10).collect(Collectors.toList());

        for (int s:l)
            System.out.println(s);

        listeSayi.stream().filter(m -> m%2==0).collect(Collectors.toList()).forEach(s-> System.out.println(s));

    }
}
