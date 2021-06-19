package hastane.service;

import com.sun.org.apache.regexp.internal.RE;
import hastane.model.*;
import hastane.util.Dosya;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DosyaService {


/*
3 adet doktor hasta randevu
doktor=>doktor.txt
hasta=>hasta.txt
randvu=>randvu.txt
 */
    public void yazdir(Object object)
    {
        try {

            if (object instanceof Doktor) {
                FileWriter fileWriter = new FileWriter(new File(Dosya.DOKTOR_FILENAME),true);
                fileWriter.write(((Doktor)object).toString());
                fileWriter.write(Character.LINE_SEPARATOR); // bir aşağıya gecirmesi
                fileWriter.close();
            }
            else if(object instanceof Hasta)
            {
                FileWriter fileWriter = new FileWriter(new File(Dosya.HASTA_FILENAME),true);
                fileWriter.write(((Hasta)object).toString());
                fileWriter.write(Character.LINE_SEPARATOR); // bir aşağıya gecirmesi
                fileWriter.close();
            }
            else if(object instanceof Randevu)
            {
                FileWriter fileWriter = new FileWriter(new File(Dosya.RANDEVU_FILENAME),true);
                fileWriter.write(((Randevu)object).toString());
                fileWriter.write(Character.LINE_SEPARATOR); // bir aşağıya gecirmesi
                fileWriter.close();
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getCause());
        }


    }

    public void update(List<?> liste,Object object)
    {
        try {

            if (object instanceof Doktor) {
                FileWriter fileWriter = new FileWriter(new File(Dosya.DOKTOR_FILENAME),false);
                for(int i=0;i<liste.size();i++){
                    fileWriter.write(((Doktor)liste.get(i)).toString());
                    fileWriter.write(Character.LINE_SEPARATOR); // bir aşağıya gecirmesi
                }
                fileWriter.close();
            }
            else if(object instanceof Hasta)
            {
                FileWriter fileWriter = new FileWriter(new File(Dosya.HASTA_FILENAME),false);
                for(int i=0;i<liste.size();i++){
                    fileWriter.write(((Hasta)liste.get(i)).toString());
                    fileWriter.write(Character.LINE_SEPARATOR); // bir aşağıya gecirmesi
                }
                fileWriter.close();
            }
            else if(object instanceof Randevu)
            {
                FileWriter fileWriter = new FileWriter(new File(Dosya.RANDEVU_FILENAME),false);
                for(int i=0;i<liste.size();i++){
                    fileWriter.write(((Randevu)liste.get(i)).toString());
                    fileWriter.write(Character.LINE_SEPARATOR); // bir aşağıya gecirmesi
                }
                fileWriter.close();
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getCause());
        }


    }

    public List<?> dosyaOku(Object object)
    {

        try{

            if(object instanceof Doktor) {
                FileReader reader = new FileReader(new File(Dosya.DOKTOR_FILENAME));

                int i = 0;
                String satir = "";
                List<Doktor> doktorList = new ArrayList<>();
                while ((i = reader.read()) != -1) {
                    char karakter = (char) i;
                    if (karakter != Character.LINE_SEPARATOR)
                        satir = satir + karakter;
                    else {
                        System.out.println(satir);
                        String elemanlar[] = satir.split(":");
                        Doktor doktor = new Doktor();
                        doktor.setId(Integer.valueOf(elemanlar[0]));
                        doktor.setAdi(elemanlar[1]);
                        doktor.setSoyadi(elemanlar[2]);
                        doktor.setSicilNo(elemanlar[3]);
                        doktor.setBolum(Bolum.getValue(elemanlar[4]));
                        doktorList.add(doktor);
                        satir = "";
                    }

                }
                return doktorList;

            }
            else if(object instanceof Hasta)
            {
                FileReader reader = new FileReader(new File(Dosya.HASTA_FILENAME));

                int i = 0;
                String satir = "";
                List<Hasta> hastaList = new ArrayList<>();
                while ((i = reader.read()) != -1) {
                    char karakter = (char) i;
                    if (karakter != Character.LINE_SEPARATOR)
                        satir = satir + karakter;
                    else {
                        System.out.println(satir);
                        String elemanlar[] = satir.split(":");
                        Hasta hasta = new Hasta();
                        hasta.setId(Integer.valueOf(elemanlar[0]));
                        hasta.setAdi(elemanlar[1]);
                        hasta.setSoyadi(elemanlar[2]);
                        hasta.setTcNo(elemanlar[3]);
                        hasta.setYasi(Integer.valueOf(elemanlar[4]));
                        hasta.setAdres(elemanlar[5]);
                        hastaList.add(hasta);
                        satir = "";
                    }

                }
                return hastaList;
            }
            else if(object instanceof Randevu)
            {
                FileReader reader = new FileReader(new File(Dosya.RANDEVU_FILENAME));

                int i = 0;
                String satir = "";
                List<Randevu> randevuList = new ArrayList<>();
                while ((i = reader.read()) != -1) {
                    char karakter = (char) i;
                    if (karakter != Character.LINE_SEPARATOR)
                        satir = satir + karakter;
                    else {
                        System.out.println(satir);
                        String elemanlar[] = satir.split(":");
                        // 1:1:1:12/12/2021 12:12
                        Randevu randevu = new Randevu();
                        randevu.setId(Integer.valueOf(elemanlar[0]));

                        int hastaId= Integer.valueOf(elemanlar[1]);

                        List<Hasta> hastaListesi = (List<Hasta>) dosyaOku(new Hasta());

                        for(Hasta hasta:hastaListesi)
                        {
                            if(hasta.getId() == hastaId)
                                randevu.setHasta(hasta);
                        }

                        int doktorId = Integer.valueOf(elemanlar[2]);

                        List<Doktor> doktorList = (List<Doktor>) dosyaOku(new Doktor());

                        for(Doktor doktor:doktorList)
                        {
                            if(doktor.getId() == doktorId)
                                randevu.setDoktor(doktor);
                        }

                        //12/12/2021 12:12  dd/mm/yyyy hh:mm
                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy hh:mm");
                        randevu.setRandevuTarih(dateFormat.parse(elemanlar[3]));
                        randevuList.add(randevu);
                        satir = "";
                    }

                }
                return randevuList;
            }

        }
        catch (Exception ex)
        {
            System.out.println(ex.getCause());
        }

        return null;
    }

}
