import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Sayi giriniz :");
            int sayi = sc.nextInt();
            if (sayi == 5)
                throw new MyException("Sayi 5 olamaz!");

            int sonuc = 100 / sayi;

            System.out.println("Sonuc :" + sonuc);
        }
        catch (MyException ex){
            System.out.println(ex.getMessage());
        }


    }
}
