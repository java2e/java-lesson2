public class TestIslem implements Islem {
    @Override
    public int topla(int s1, int s2) throws ArithmeticException {
        return s1+s2;
    }
    @Override
    public int bol(int s1, int s2)  {
        try {
            if(s2 == 0)
                throw new ArithmeticException("0 a bir sayı bölünemez!");
            return s1/s2;
        }catch (ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
            return 0;
        }
    }
}
