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

    }

    @Override
    public void guncelle(Doktor doktor) throws ServiceExcepiton {

    }

    @Override
    public List<Doktor> liste() throws ServiceExcepiton {

        DosyaService dosyaService=new DosyaService();
        List<Doktor> liste = (List<Doktor>) dosyaService.dosyaOku(new Doktor());

        return null;
    }
}
