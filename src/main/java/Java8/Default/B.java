package Java8.Default;

public class B implements A{
    @Override
    public void test1(){
        System.out.println("from test 1");
    }

    public static void main(String[] args) {
        B b1=new B();
        b1.test1();
        b1.test2();
    }
}
