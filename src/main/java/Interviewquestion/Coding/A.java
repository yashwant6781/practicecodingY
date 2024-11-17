package Interviewquestion.Coding;

public class A {
    public static void main(String[] args) {
        try{
            int x=10;
            int y=0;
            int z=x/y;
            System.out.println(z);
        }catch ( ArithmeticException a){
            a.printStackTrace();
        }
        System.out.println("Welcome");
    }
}
