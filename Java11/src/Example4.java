import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Example4 {

    public static void main(String[] args) {

        try {

            File file = new File("D:\\javaders\\java.txt");

            if (!file.exists())
                file.createNewFile();

            FileOutputStream out = new FileOutputStream(file,false);

            Scanner sc = new Scanner(System.in);

            System.out.println("Adınızı giriniz :");

            String adi = sc.nextLine();

            System.out.println("Soyadınızı giriniz :");

            String soyadi = sc.nextLine();

            System.out.println("Şehrinizi giriniz :");

            String sehir = sc.nextLine();

            out.write(adi.getBytes());
            out.write(" ".getBytes());
            out.write(soyadi.getBytes());
            out.write(" ".getBytes());
            out.write(sehir.getBytes());


        }
        catch (IOException ex){

        }


    }
}
