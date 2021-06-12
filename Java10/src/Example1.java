import java.util.ArrayList;
import java.util.List;

public class Example1 {

    public static void main(String[] args) {

        ArrayList<String> liste = new ArrayList<>();
        liste.add("java");
        liste.get(0);
        liste.isEmpty();
        liste.add("jojo");
        liste.remove(0);
        liste.remove("jojo");

        liste.add("ali");
        liste.add("mehmet");
        liste.add("can");
        liste.clear();

        ArrayList<String> liste2 = new ArrayList<String>();

        liste2.add("luffy");
        String deger = liste2.get(0);
        System.out.println(deger);
        System.out.println(liste2.get(0));

        for(int i=0;i<liste.size();i++)
        {
            System.out.println(liste.get(i));
        }



    }
}
