import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example3 {
    /*

    JAVA IO => Input Output

     */

    public static void main(String[] args)  {

        try {

            File file =new File("D:\\javaders\\test2.txt");

            if(!file.exists())
                file.createNewFile();
            FileOutputStream outputStream = new FileOutputStream(file,true);
            String kelime ="Merhaba Java";
            outputStream.write(kelime.getBytes());
            outputStream.write(" ".getBytes());
            outputStream.write(kelime.getBytes());

        }
        catch (IOException ex){
            System.out.println(ex.getCause());
        }
        /*


        java adında bir txt dosya olusturunuz
        Dosyaya ekrandan okuyarak
        adını
        soyadını
        ve sehrinizi yazdırınız?


         */



    }
}
