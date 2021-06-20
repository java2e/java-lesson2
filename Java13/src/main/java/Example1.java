import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.util.Date;

public class Example1  {

    public static void main(String[] args) {

        String fileName= "D:\\javaders\\example2.xlsx";
        try{

            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Ornek");
            String title [] = {"Adi","Soyadi","Numarası","Kayıt Tarihi"};
            Row row = sheet.createRow(0);

            for(int i=0;i<title.length;i++){
                Cell hucre = row.createCell(i);
                hucre.setCellValue(title[i]);
            }

            // Alt satırları da veriler eklenecek!

            for(int j=1;j<10;j++){

                Row row1= sheet.createRow(j);

                for(int k=0;k<title.length;k++)
                {
                    Cell cell = row1.createCell(k);
                    if(k==0)
                        cell.setCellValue("Mehmet"+k);
                    else if(k==1)
                        cell.setCellValue("Developer"+k);
                    else if(k==2)
                        cell.setCellValue("1234"+k);
                    else if(k==3)
                            cell.setCellValue("12/06/2021");
                }

            }



            FileOutputStream outputStream=new FileOutputStream(fileName);
            workbook.write(outputStream);
            workbook.close();




        }
        catch (Exception ex){

        }



    }
}
