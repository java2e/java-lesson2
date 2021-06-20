package tr.obs;

import tr.obs.model.Ogrenci;
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
    }
}
