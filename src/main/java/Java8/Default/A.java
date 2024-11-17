package Java8.Default;

@FunctionalInterface
public interface A {
    public void test1();

    default public void test2(){
        System.out.println("from test 2");
    }
}