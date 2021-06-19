package hastane.exception;

public class ServiceExcepiton extends RuntimeException {

    private String className;

    private String methodName;

    private String hata;


    public ServiceExcepiton(String className,String methodName,String hata)
    {
        super(String.format("Service Exception : %s - %s - %s",className,methodName,hata));
        // Service Exception : HastaService.class save null
    }
}
