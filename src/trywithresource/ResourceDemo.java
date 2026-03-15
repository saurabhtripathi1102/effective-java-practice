package trywithresource;

public class ResourceDemo implements AutoCloseable{

    public void utilizeResource(int a, int b) throws Exception {
        System.out.println("It is utilizing the resource with sum"+(a+b));
        throw new Exception("Some exception occurred for utilization Resource");
    }

    public ResourceDemo(int a,int b){
        System.out.println("sum is : "+(a+b));
    }
    @Override
    public void close() throws Exception {
        System.out.println("Some exception occurred ");
        throw new Exception("Exception from close()");
    }
}
