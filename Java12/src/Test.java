import hastane.model.Bolum;
import hastane.model.Doktor;
import hastane.model.Hasta;
import hastane.service.DoktorService;
import hastane.service.HastaService;

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
        doktor.setId(5);
        doktor.setAdi("Mehmet");
        doktor.setSoyadi("Developer");
        doktor.setSicilNo("4534634");
        doktor.setBolum(Bolum.DERMATAOLOJI);

        DoktorService doktorService = new DoktorService();
        //doktorService.ekle(doktor);

        //doktorService.liste();

        //doktor.setId(4);
        //doktorService.sil(doktor);
        doktorService.guncelle(doktor);
        doktorService.liste();


        Hasta hasta = new Hasta();
        hasta.setId(1);
        hasta.setAdi("Mehmet");
        hasta.setSoyadi("Java");
        hasta.setTcNo("12313123");
        hasta.setAdres("Ankara");
        hasta.setYasi(17);

        HastaService hastaService = new HastaService();
        hastaService.ekle(hasta);


    }
}
