package OOPS.Encapsulation;

public class B {
    public static void main(String[] args) {
        A a1=new A();
        a1.setId(100);
        a1.setUsername("mike");
        a1.setPassword("testing");
        System.out.println(a1.getId());
        System.out.println(a1.getUsername());
        System.out.println(a1.getPassword());

    }
}