package tr.obs;

import tr.obs.model.Ders;
import tr.obs.model.Ogrenci;
import tr.obs.model.OgrenciDers;
import tr.obs.service.BaseService;

import java.io.IOException;
import java.util.Date;

public class Test {
    /*
    Ogrenci
    Ders
    OgrenciDers

     */

    public static void main(String[] args) throws IllegalAccessException, IOException {

        BaseService baseService = new BaseService();

        Ogrenci ogrenci = new Ogrenci();
        ogrenci.setId(1);
        ogrenci.setOgrenciAdi("Mehmet");
        ogrenci.setSoyadi("Developer");
        ogrenci.setNumarasi("2342");
        ogrenci.setKayitTarihi(new Date());
        ogrenci.setBolum("Bilgisayar Mühendisliği");

        baseService.excelYaz(ogrenci);

        Ders ders = new Ders();
        ders.setId(1);
        ders.setDersAdi("Matematik");
        ders.setKredi(4);

        baseService.excelYaz(ders);

        OgrenciDers ogrenciDers = new OgrenciDers();
        ogrenciDers.setDers(ders);
        ogrenciDers.setOgrenci(ogrenci);
        ogrenciDers.setVize(20);
        ogrenciDers.setFinalNotu(50);
        ogrenciDers.setOrtalama(35);

        baseService.excelYaz(ogrenciDers);
    }
}
