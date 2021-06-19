import hastane.model.Bolum;
import hastane.model.Doktor;
import hastane.service.DoktorService;

public class Test {
    /*
    Doktor
        id,adi,soyadi,sicil,bolum
    Randevu
        id,tarih,doktor,hasta
    Hasta
        id,adi,soyadi,tcno,yasi,adres

        3.txt olacak
            doktor.txt
                ID Adı   Soyadı   Sicil   Bolum
                1 Ahmet Developer 1234    Cocuk Hastalıkları
            randevu.txt
               ID Tarih Doktor Hasta
               1  20/062021 12:00 1  1
            hasta.txt
                ID Adi Soyadi TC  Yasi Adres
                1  Mustafa Ak 1234 12 Ankara

                Model Class-> Doktor,Randevu,Hasta
                Service -> ekle,sil,guncelle,list, ...
                File IO -> yaz,oku
     */

    public static void main(String[] args) {
        Bolum bolum = Bolum.COCUK_HASTALIKLARI; // id,text 1=> Cocuk Hastalıkları

        Doktor doktor = new Doktor();
        doktor.setId(1);
        doktor.setAdi("Java");
        doktor.setSoyadi("Developer");
        doktor.setSicilNo("1234");
        doktor.setBolum(Bolum.COCUK_HASTALIKLARI);

        DoktorService doktorService = new DoktorService();
        doktorService.ekle(doktor);

        doktorService.liste();

    }
}
