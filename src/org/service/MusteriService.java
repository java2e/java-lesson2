package org.service;

import org.model.Musteri;

import java.util.ArrayList;
import java.util.List;

public class MusteriService extends Util implements IService<Musteri> {

    @Override
    public void ekle(Musteri musteri) {

        if(MUSTERI_LISTESI==null)
        {
            MUSTERI_LISTESI = new ArrayList<>();
            MUSTERI_LISTESI.add(musteri);
        }
        else
            MUSTERI_LISTESI.add(musteri);


    }

    @Override
    public void sil(Musteri musteri) {

        if(MUSTERI_LISTESI != null){

            for(int i=0;i<MUSTERI_LISTESI.size();i++)
            {
                if(MUSTERI_LISTESI.get(i).getAdiSoyadi().equals(musteri.getAdiSoyadi()))
                {
                    MUSTERI_LISTESI.remove(i);
                    break;
                }

            }
        }

    }

    @Override
    public List<Musteri> liste() {
        return MUSTERI_LISTESI;
    }

    @Override
    public void guncelle(Musteri musteri) {


        for(int i=0;i<MUSTERI_LISTESI.size();i++)
        {

            if(MUSTERI_LISTESI.get(i).getId() == musteri.getId())
            {
                MUSTERI_LISTESI.set(i,musteri);
            }

        }

    }
}
