package singleton;

public class A {
    static private A a1=null;
    private A(){

    }
    public static A getInstance(){
        if(a1 == null){
            a1=new A();
        }
        return a1;
    }
}
