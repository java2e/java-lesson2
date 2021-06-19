package hastane.service;

import hastane.exception.ServiceExcepiton;
import hastane.model.Randevu;
import hastane.util.Dosya;

import java.util.List;

public class RandevuService implements BaseService<Randevu> {
    @Override
    public void ekle(Randevu randevu) throws ServiceExcepiton {
        DosyaService dosyaService = new DosyaService();
        dosyaService.yazdir(randevu);
    }

    @Override
    public void sil(Randevu randevu) throws ServiceExcepiton {
        DosyaService dosyaService = new DosyaService();
        List<Randevu> liste = (List<Randevu>) dosyaService.dosyaOku(new Randevu());

        for(int i=0;i<liste.size();i++){
            if(liste.get(i).getId() == randevu.getId())
            {
                liste.remove(i);
                break;
            }
        }

        dosyaService.update(liste,new Randevu());


    }

    @Override
    public void guncelle(Randevu randevu) throws ServiceExcepiton {
        DosyaService dosyaService = new DosyaService();
        List<Randevu> liste = (List<Randevu>) dosyaService.dosyaOku(new Randevu());

        for(int i=0;i<liste.size();i++){
            if(liste.get(i).getId() == randevu.getId())
            {
                liste.set(i,randevu);
                break;
            }
        }

        dosyaService.update(liste,new Randevu());
    }

    @Override
    public List<Randevu> liste() throws ServiceExcepiton {

        DosyaService dosyaService = new DosyaService();
        List<Randevu> liste = (List<Randevu>) dosyaService.dosyaOku(new Randevu());
        return liste;
    }
}
