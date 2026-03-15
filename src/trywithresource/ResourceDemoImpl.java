package trywithresource;

public class ResourceDemoImpl {

    public static void main(String[] args) {
        System.out.println("=======================");
        tryWithFinally();
        System.out.println("========================");
        tryWithResource();
    }

    public static void tryWithFinally(){
        ResourceDemo rd = new ResourceDemo(10,20);
        try{
            rd.utilizeResource(10,30);
        } catch (Exception e) {
            System.out.println("Exception occurred");
        } finally{
            try{
                rd.close();
            }catch(Exception exp){
                System.out.println("Close exception  : "+exp.toString());
            }
        }
    }

    public  static void tryWithResource(){
        try(ResourceDemo rd = new ResourceDemo(10,20)){
            rd.utilizeResource(10,20);
        } catch (Exception e) {
            System.out.println("Exception ");
            for(Throwable th : e.getSuppressed()){
                System.out.println("Surpressed : "+th.getMessage());
            }
        }
    }
}
