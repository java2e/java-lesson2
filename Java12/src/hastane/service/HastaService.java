package hastane.service;

import hastane.exception.ServiceExcepiton;
import hastane.model.Hasta;
import hastane.util.Dosya;

import java.util.List;

public class HastaService implements BaseService<Hasta> {
    @Override
    public void ekle(Hasta hasta) throws ServiceExcepiton {
        DosyaService dosyaService = new DosyaService();
        dosyaService.yazdir(hasta);

    }

    @Override
    public void sil(Hasta hasta) throws ServiceExcepiton {

        DosyaService dosyaService = new DosyaService();
        List<Hasta> liste = (List<Hasta>) dosyaService.dosyaOku(new Hasta());

        for(int i=0;i<liste.size();i++){
            if(liste.get(i).getId() == hasta.getId()){
                liste.remove(i);
                break;
            }
        }
        dosyaService.update(liste,new Hasta());
    }

    @Override
    public void guncelle(Hasta hasta) throws ServiceExcepiton {

        DosyaService dosyaService = new DosyaService();
        List<Hasta> liste = (List<Hasta>) dosyaService.dosyaOku(new Hasta());

        for(int i=0;i<liste.size();i++){
            if(liste.get(i).getId() == hasta.getId()){
                liste.set(i,hasta);
            }
        }

        dosyaService.update(liste,new Hasta());

    }

    @Override
    public List<Hasta> liste() throws ServiceExcepiton {
        DosyaService dosyaService = new DosyaService();
        List<Hasta> liste = (List<Hasta>) dosyaService.dosyaOku(new Hasta());
        return liste;
    }
}
