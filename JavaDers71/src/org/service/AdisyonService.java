package org.service;

import org.model.Adisyon;

import java.util.ArrayList;
import java.util.List;

public class AdisyonService extends Util implements IService<Adisyon> {
    @Override
    public void ekle(Adisyon adisyon) {

        if(ADISYON_LISTESI == null)
        {
            ADISYON_LISTESI =new ArrayList<>();

            ADISYON_LISTESI.add(adisyon);
        }
        else{
            ADISYON_LISTESI.add(adisyon);
        }
    }

    @Override
    public void sil(Adisyon adisyon) {

        if(ADISYON_LISTESI != null)
        {
            for(int i=0;i<ADISYON_LISTESI.size();i++)
            {
                if(ADISYON_LISTESI.get(i).getId() == adisyon.getId())
                {
                    ADISYON_LISTESI.remove(i);
                    break;
                }
            }
        }
    }

    @Override
    public List<Adisyon> liste() {
        return ADISYON_LISTESI;
    }

    @Override
    public void guncelle(Adisyon adisyon) {

        if(ADISYON_LISTESI != null)
        {
            for(int i=0;i<ADISYON_LISTESI.size();i++)
            {
                if(ADISYON_LISTESI.get(i).getId() == adisyon.getId()){

                    ADISYON_LISTESI.set(i,adisyon);
                }
            }
        }
    }

    public float adisyonToplami(int id){

        /*
        musteri idleri eşit olan adisyonları cekecek
         */

        float toplam =0;

        for(int i=0;i<ADISYON_LISTESI.size();i++){

            if(ADISYON_LISTESI.get(i).getMusteri().getId() ==id){
             toplam = toplam + ADISYON_LISTESI.get(i).getFiyat();
            }
        }

        return toplam;

    }
}
