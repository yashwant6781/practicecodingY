package OOPS.polymorphism.Runtime;

public class B extends A{
    @Override
    public int test(){
        return 200;
    }

    public static void main(String[] args) {
        B b1=new B();
        int val=b1.test();
        System.out.println(val);
    }
}
