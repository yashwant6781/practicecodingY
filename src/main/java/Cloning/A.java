package Cloning;

public class A implements Cloneable{
    public static void main(String[] args) {
        A a1=new A();
        try{
            A a2=(A)a1.clone();
            System.out.println(a1);
            System.out.println(a2);
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
