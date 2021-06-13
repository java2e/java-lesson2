import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example6 {

    /*
    BufferOutput
     */
    public static void main(String[] args) {

        try{

            File file = new File("D:\\javaders\\example.txt");

            if(!file.exists())
                file.createNewFile();

            FileOutputStream out = new FileOutputStream(file);

            BufferedOutputStream outputStream = new BufferedOutputStream(out);

            String kelime ="Test Deneme";

           outputStream.write(kelime.getBytes());

           outputStream.close();


            //out.write(kelime.getBytes());



        }
        catch (IOException ex){

        }


    }
}
