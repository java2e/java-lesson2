import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ReadExcelExample  {

    public static void main(String[] args) throws IOException {


        FileInputStream inputStream = new FileInputStream(new File("D:\\javaders\\example.xlsx"));

        XSSFWorkbook workbook= new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheet("sayfa1");
        int lastRowNum = sheet.getLastRowNum();

        Row sonRow  = sheet.createRow(lastRowNum);


        Row row = sheet.getRow(0);

        String value =row.getCell(0).getStringCellValue();

        System.out.println(value);

    }
}
