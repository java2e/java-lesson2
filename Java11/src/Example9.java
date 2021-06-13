import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Example9 {

    public static void main(String[] args) {

        try {

            File file = new File("D:\\javaders\\out.txt");
            if(!file.exists())
                file.createNewFile();
            FileReader reader = new FileReader(file);
            int i = reader.read();
            while (i!=-1)
            {
                System.out.print((char) i);
                i= reader.read();
            }

           // System.out.println(reader.read());


        }
        catch (IOException ex)
        {

        }


    }
}
