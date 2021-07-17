package tr.obs.service;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import tr.obs.model.Ders;
import tr.obs.model.Ogrenci;
import tr.obs.model.OgrenciDers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;

public class BaseService {

    /*
    Sheet
    Row
    Cell
     */

    public String fileName="D:\\javaders\\example3.xlsx";
    public XSSFWorkbook workbook;

    public BaseService() throws IOException {
        FileInputStream inputStream = new FileInputStream(fileName);
        workbook = new XSSFWorkbook(inputStream);
    }

    public XSSFSheet createSheet(String sheetName)
    {
        return workbook.createSheet(sheetName);
    }

    public void excelYaz(Object object) throws IllegalAccessException, IOException {
        // Ogrenci Ders OgrenciDers???


        if(object instanceof Ogrenci)
        {

            XSSFSheet sheet = workbook.getSheet("Ogrenci");
            int lastNumRow=sheet.getLastRowNum();
            XSSFRow row = sheet.createRow(lastNumRow+1); // Dinamik Olacak!
            Ogrenci ogrenci= (Ogrenci) object;
            Field field[] =  Ogrenci.class.getDeclaredFields(); // Java Reflection

            for(int i=0;i<field.length;i++)
            {
                field[i].setAccessible(true); // private?
                Object o = field[i].get(ogrenci);
                Cell cell = row.createCell(i);
                cell.setCellValue(o.toString());
            }

            FileOutputStream outputStream = new FileOutputStream(fileName);
            workbook.write(outputStream);

            System.out.println();

        }
        else if(object instanceof Ders)
        {

            XSSFSheet sheet = workbook.getSheet("Ders");
            int lastRowNum = sheet.getLastRowNum();
            XSSFRow row = sheet.createRow(lastRowNum+1);
            Ders ders = (Ders) object;
            Field field[] = Ders.class.getDeclaredFields();
            for(int i=0;i<field.length;i++)
            {
                field[i].setAccessible(true);
                Object o = field[i].get(ders);
                Cell cell = row.createCell(i);
                cell.setCellValue(o.toString());
            }

            FileOutputStream outputStream = new FileOutputStream(fileName);
            workbook.write(outputStream);

        }
        else if(object instanceof  OgrenciDers)
        {

            XSSFSheet sheet = workbook.getSheet("OgrenciDers");
            int lastRowNum = sheet.getLastRowNum();
            XSSFRow row = sheet.createRow(lastRowNum);
            OgrenciDers ogrenciDers = (OgrenciDers) object;
            Field fields[] = OgrenciDers.class.getDeclaredFields();
            for(int k=0;k<fields.length;k++){
                fields[k].setAccessible(true);

                if(fields[k].getName() =="ders"){

                    Field fieldDers[] = fields[k].get(ogrenciDers).getClass().getDeclaredFields();
                    for(Field f:fieldDers)
                        if(f.getName().equals("id")) {
                            f.setAccessible(true);
                            Object value = f.get(ogrenciDers.getDers());
                            Cell cell = row.createCell(k);
                            cell.setCellValue(value.toString());
                        }
                }
                else  if(fields[k].getName() =="ogrenci"){

                    Field fieldOgrenci[] = fields[k].get(ogrenciDers).getClass().getDeclaredFields();
                    for(Field f:fieldOgrenci)
                        if(f.getName().equals("id")) {
                            f.setAccessible(true);
                            Object value = f.get(ogrenciDers.getOgrenci());
                            Cell cell = row.createCell(k);
                            cell.setCellValue(value.toString());
                        }
                }
                else{
                    Object value = fields[k].get(ogrenciDers);
                    Cell cell = row.createCell(k);
                    cell.setCellValue(value.toString());
                }

                FileOutputStream outputStream = new FileOutputStream(fileName);
                workbook.write(outputStream);


            }

        }



    }


}
