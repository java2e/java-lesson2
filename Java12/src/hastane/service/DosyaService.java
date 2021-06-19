package hastane.service;

import com.sun.org.apache.regexp.internal.RE;
import hastane.model.BaseModel;
import hastane.model.Bolum;
import hastane.model.Doktor;
import hastane.model.Hasta;
import hastane.util.Dosya;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
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
        }
        catch (Exception ex)
        {

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
        }
        catch (Exception ex)
        {

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

        }
        catch (Exception ex)
        {
            System.out.println(ex.getCause());
        }

        return null;
    }

}
