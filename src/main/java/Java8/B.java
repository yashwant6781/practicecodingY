package Java8;

public class B implements A{
    @Override
    public void test(){
        System.out.println("fro test");
    }

    public static void main(String[] args) {
        B b1=new B();
        b1.test();
    }
}