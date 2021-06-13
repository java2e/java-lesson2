import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Example7 {

    public static void main(String[] args) {


        try {

            File file = new File("D:\\javaders\\input.txt");

            if(!file.exists())
                file.createNewFile();
            FileInputStream input = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(input);
            int i = bufferedInputStream.read();
            while (i!=-1)
            {
                System.out.print((char)i);
                i = bufferedInputStream.read();
            }

        }
        catch (IOException ex)
        {


        }

    }
}
