package throws_throw_Exception.THROW;
public class A {
    public static void main(String[] args) {
        try{
            throw new ApplicationCrashed();
        }catch(ApplicationCrashed e){
            System.out.println(e);
            System.out.println("Application Restarting");
        }
    }
}
