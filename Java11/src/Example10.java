import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Example10 {

    public static void main(String[] args) {

        try{

            File file = new File("D:\\javaders\\test.txt");
            if(!file.exists())
                file.createNewFile();

            FileWriter fileWriter = new FileWriter(file);

            Scanner sc = new Scanner(System.in);
            while (true){

                System.out.println("Bir kelime giriniz ");
                String kelime = sc.nextLine();
                fileWriter.write(kelime);
                fileWriter.write(Character.LINE_SEPARATOR);
                if(kelime.equals("exit"))
                    break;
            }

            fileWriter.close();

        }
        catch (IOException io)
        {

        }
    }
}
