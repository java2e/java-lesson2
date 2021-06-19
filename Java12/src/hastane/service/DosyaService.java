package hastane.service;

import com.sun.org.apache.regexp.internal.RE;
import hastane.model.BaseModel;
import hastane.model.Bolum;
import hastane.model.Doktor;
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
        }
        catch (Exception ex)
        {

        }


    }

    public List<?> dosyaOku(Object object)
    {

        try{

            FileReader reader = new FileReader(new File(Dosya.DOKTOR_FILENAME));

            int i=0;
            String satir="";
            List<Doktor> doktorList = new ArrayList<>();
            while ((i=reader.read()) != -1)
            {
                char karakter = (char)i;
                if(karakter != Character.LINE_SEPARATOR)
                    satir=satir+karakter;
                else{
                    System.out.println(satir);
                    String elemanlar[] =satir.split(":");
                    Doktor doktor= new Doktor();
                    doktor.setId(Integer.valueOf(elemanlar[0]));
                    doktor.setAdi(elemanlar[1]);
                    doktor.setSoyadi(elemanlar[2]);
                    doktor.setSicilNo(elemanlar[3]);
                    doktor.setBolum(Bolum.getValue(elemanlar[4]));
                    doktorList.add(doktor);
                    satir="";
                }

            }
            return doktorList;


        }
        catch (Exception ex)
        {
            System.out.println(ex.getCause());
        }

        return null;
    }

}
