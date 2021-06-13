import java.util.Scanner;

public class Example1
{

    /*

    try{
    Asıl kod
    eğer hata oldugunu dusundugunuz kod blogu
    }
    catch( parametre ???){
    Excepiton ex
    NullPointer nesne üretmeden kullan
    AritmeticExcepiton matem
    IndexOfBound dizinin boyutu
    ....
    custom
    }
    catch(parametre2)
    {
    }
    finaly optional
    {

    }

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Sayı giriniz :");

            int sayi = scanner.nextInt();

            int sonuc = 100 / sayi;

            System.out.println(sonuc);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

        System.out.println("Program Bitti");

        TestIslem testIslem = new TestIslem();
        testIslem.bol(10,0);

    }
}
