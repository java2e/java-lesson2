import org.model.Musteri;
import org.service.MusteriService;

public class Test2 {

    public static void main(String[] args) {


        Musteri musteri = new Musteri(1,"Java","Ankara");

        MusteriService musteriService = new MusteriService();

        musteriService.ekle(musteri);

        musteri = new Musteri(2,"Python","Adana");

        musteriService.ekle(musteri);

        for(Musteri mus:musteriService.liste())
            System.out.println(mus.getId()+" "+mus.getAdiSoyadi()+" "+mus.getAdres());




    }
}
