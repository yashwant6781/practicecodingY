package reverseString.Tokenizer;

import java.util.StringTokenizer;

public class A {
    public static void main(String[] args) {
        int count=0;
        StringTokenizer str = new StringTokenizer("fb jkhdfjh jsgnj nlkjfg");
        while(str.hasMoreTokens()){
            System.out.println(str.nextToken());
            count++;
        }
        System.out.println(count++);
    }
}