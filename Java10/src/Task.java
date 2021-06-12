public class Task implements Comparable<Task> {

    public int sayi1;
    public int sayi2;

    @Override
    public int compareTo(Task o) {

        if(this.sayi1 == o.sayi1 && this.sayi2 == o.sayi2)
            return 1;
        else
            return 0;
    }
}
