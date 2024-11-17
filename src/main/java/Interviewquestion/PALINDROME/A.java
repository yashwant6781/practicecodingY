package Interviewquestion.PALINDROME;

public class A {
    public static void main(String[] args) {
        String str ="madam";
        String rev = "";
        for(int i=0; i<str.length(); i++){
            rev=str.charAt(i)+rev;
        }
        if(rev.equals(str)){
            System.out.println(str + "     is a palindrome ji");
        }else{
            System.out.println(str + "   is not a palindrome ji");
        }
    }
}




