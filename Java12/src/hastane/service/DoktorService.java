package hastane.service;

import hastane.exception.ServiceExcepiton;
import hastane.model.Doktor;
import hastane.util.Dosya;

import java.util.List;

public class DoktorService implements BaseService<Doktor> {
    @Override
    public void ekle(Doktor doktor) throws ServiceExcepiton {
        DosyaService dosyaService = new DosyaService();
        dosyaService.yazdir(doktor);
        dosyaService.dosyaOku(doktor);
    }

    @Override
    public void sil(Doktor doktor) throws ServiceExcepiton {

        DosyaService dosyaService = new DosyaService();
        List<Doktor> liste = (List<Doktor>) dosyaService.dosyaOku(new Doktor());

        for(int i=0;i<liste.size();i++)
        {
            if(liste.get(i).getId() == doktor.getId())
            {
                liste.remove(i);
                break;
            }
        }

        dosyaService.update(liste,new Doktor());


    }

    @Override
    public void guncelle(Doktor doktor) throws ServiceExcepiton {

        DosyaService dosyaService = new DosyaService();

        List<Doktor> liste = (List<Doktor>) dosyaService.dosyaOku(new Doktor());

        for(int i=0;i<liste.size();i++){
            if(liste.get(i).getId() == doktor.getId())
            {
                liste.set(i,doktor);
            }
        }

        dosyaService.update(liste,new Doktor());

    }

    @Override
    public List<Doktor> liste() throws ServiceExcepiton {

        DosyaService dosyaService=new DosyaService();
        List<Doktor> liste = (List<Doktor>) dosyaService.dosyaOku(new Doktor());

        return liste;
    }
}
