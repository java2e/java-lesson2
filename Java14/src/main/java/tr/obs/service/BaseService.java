package tr.obs.service;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import tr.obs.model.Ogrenci;

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

    public BaseService()
    {
        workbook = new XSSFWorkbook();
    }

    public XSSFSheet createSheet(String sheetName)
    {
        return workbook.createSheet(sheetName);
    }

    public void excelYaz(Object object) throws IllegalAccessException, IOException {
        // Ogrenci Ders OgrenciDers???
        if(object instanceof Ogrenci)
        {

            XSSFSheet sheet = createSheet("Ogrenci");
            XSSFRow row = sheet.createRow(0); // Dinamik Olacak!
            Ogrenci ogrenci= (Ogrenci) object;
            Field field[] =  Ogrenci.class.getDeclaredFields(); // Java Reflection

            for(int i=0;i<field.length;i++)
            {
                field[i].setAccessible(true);
                Object o = field[i].get(ogrenci);
                Cell cell = row.createCell(i);
                cell.setCellValue(o.toString());
            }

            FileOutputStream outputStream = new FileOutputStream(fileName);
            workbook.write(outputStream);
            workbook.close();



            System.out.println();

        }



    }


}
