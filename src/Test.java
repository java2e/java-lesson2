import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    /*
    Collection Framework

    Listeleme Sınıfları

    List -> Interface, generic
    içerisinde ekle,sil,arama gibi bir takım methodlar bulunduran interface
    ArrayList-> List implemente eder.

     */

    public static void main(String[] args) {
/*
        ArrayList<String> liste =new ArrayList();
        ArrayList<Integer> liste2=new ArrayList<>();

        List liste3 = new ArrayList();

        liste.add("Java"); // listeye eleman ekler 0,1,2,3,
        liste.get(0); // java
        liste.set(0,"Java 2"); // 1.index eleman setler
        liste.isEmpty(); // liste eleman var mı yok true false
        liste.clear(); //listeye siler
        liste.size(); //elemanın boyutu verir
        liste.remove(0); // 0.index siler
        liste.toArray();// listeyi dizi tipine ceviri String [];

        liste.forEach(a-> System.out.println(a)); // lambda expresion Java 8

        liste.addAll(liste); // List tipinde
        // liste2
        liste.removeAll(liste); // list tipinde



        Ekrandan a ile başlayan kelimeleri listeye ekleyiniz,
        aynı kelime girilmişse o kelimeyi siliniz. exit kodu sonlandırsın

        adana
        ankara
        adıyaman
        size = 3
        bartın *
        adana => silecek
        size =2

         */


        List<String> liste = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        while (true)
        {

            String kelime =sc.nextLine();


            if(kelime.charAt(0) == 'a')
            {
                boolean varMi= false;
                for(int i=0;i<liste.size();i++) //
                {
                    if(liste.get(i).equals(kelime)) {
                        liste.remove(i); // i.index bulunan silinir.
                        varMi=true;
                        break;
                    }
                }
                if( !varMi ) liste.add(kelime);
            }
            else if(kelime == "exit")
                break;

            System.out.println(liste.size());

        }

    }
}

/*

org.model.Musteri
    adi
    soyadi
    adres

Adisyon
    musteri
    menuadi
    fiyati

org.model.Musteri listesi olacak
Adisyon listesi olacak


Service içeriisnde ekle sil methodları olacak
ekle : musteri,adisyon ekleme yapılacak
sil: musteri,adisyon silme yapılacak
ArrayList











 */
