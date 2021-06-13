import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Example8 {

    public static void main(String[] args) {


        try{

            File file = new File("D:\\javaders\\out.txt");

            if(!file.exists())
                file.createNewFile();

            FileWriter writer = new FileWriter(file);
            String kelime = "Java Developer!";
            writer.write(kelime);
            writer.write(kelime,0,10);
            writer.close();

        }
        catch (IOException ex){


        }


    }
}
