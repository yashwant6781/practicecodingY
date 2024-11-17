package OOPS.polymorphism.Compile;

public class A {
    public void test(){
        System.out.println(1);
    }
    public void test1(int x ){
        System.out.println(x);
    }

    public static void main(String[] args) {
        A a1=new A();
        a1.test();
        a1.test1(2);
    }

}

