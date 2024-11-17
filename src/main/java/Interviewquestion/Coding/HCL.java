package Interviewquestion.Coding;


        import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

 public class HCL {
     public static void main(String[] args) {
         List<Integer> numbers=Arrays.asList(10,12,5,89,69,100,32);
         List<Integer> result = numbers.stream().filter(x->Integer.toString(x).startsWith("1"))
                 .collect(Collectors.toList());
         System.out.println(result);
     }
}



