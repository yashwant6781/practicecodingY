package reverseString;

public class B {
    public static void main(String[] args) {
        String str ="ab fjhn gnjnvng negjn nlegnljk";
        String [] s = str.trim().split(" ");
        System.out.println(s.length);
        for(String x:s){
            System.out.println(x);
        }
    }
}