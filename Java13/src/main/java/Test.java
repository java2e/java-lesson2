import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {

        String fileName="D:\\javaders\\example.xlsx";
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("sayfa1");

        Row satir = sheet.createRow(0);
        Cell hucre = satir.createCell(0);
        hucre.setCellValue("Merhaba Exel!");

        FileOutputStream outputStream=new FileOutputStream(fileName);

        workbook.write(outputStream);
        workbook.close();
    }
}
