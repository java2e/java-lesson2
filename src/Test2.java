import org.model.Adisyon;
import org.model.Musteri;
import org.service.AdisyonService;
import org.service.MusteriService;

public class Test2 {

    public static void main(String[] args) {

        AdisyonService  adisyonService = new AdisyonService();

        Musteri musteri = new Musteri(1,"Java","Ankara");

        MusteriService musteriService = new MusteriService();

        musteriService.ekle(musteri);

        musteri = new Musteri(2,"Python","Adana");

        musteriService.ekle(musteri);

        Adisyon adisyon1=new Adisyon(1,musteri,"Yemek 1",10.5f);

        adisyonService.ekle(adisyon1);

        adisyon1 = new Adisyon(2,musteri,"Yemek 2",20.5f);

        adisyonService.ekle(adisyon1);

        System.out.println("Genel Toplam :"+adisyonService.adisyonToplami(musteri.getId()));

        for(Musteri mus:musteriService.liste())
            System.out.println(mus.getId()+" "+mus.getAdiSoyadi()+" "+mus.getAdres());




    }
}
