import sun.nio.ch.FileKey;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Example5 {

    /*
    InputStream
     */

    public static void main(String[] args) {
        try
        {
            File file = new File("D:\\javaders\\java.txt");

            if(!file.exists())
                file.createNewFile();

            FileInputStream inputStream = new FileInputStream(file);

            int i=inputStream.read(); // 1.byte okuyor...

            while (i!=-1) {
                System.out.print((char) i);
                i=inputStream.read();
            }

        }
        catch (IOException ex){

        }
    }
}
