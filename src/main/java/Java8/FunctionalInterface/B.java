package Java8.FunctionalInterface;

public class B implements A{
    @Override
    public void test(){
        System.out.println("from test");
    }

    public static void main(String[] args) {
        B b1=new B();
        b1.test();
    }
}