import java.util.HashMap;

public class Test2 {

    public static void main(String[] args) {


        MuhaseIslem muhaseIslem = new MuhaseIslem();

        muhaseIslem.sayi1= 10;
        muhaseIslem.sayi2=15;

        System.out.println("Sonuc :"+muhaseIslem.toplam());
        System.out.println("Sonuc 2:"+muhaseIslem.cikarma());

        GenelIslem genelIslem = new GenelIslem();
        genelIslem.s1=10.5;
        genelIslem.s2=4.7;
        System.out.println(genelIslem.toplam());
        System.out.println(genelIslem.cikarma());

        Task task1 = new Task();
        task1.sayi2=10;
        task1.sayi1=15;

        Task task2 = new Task();
        task1.sayi1=14;
        task2.sayi2=10;

        if(task1.compareTo(task2) ==1 )
            System.out.println("Eşittir");
        else
            System.out.println("Eşit değildir!!!");
    }
}
