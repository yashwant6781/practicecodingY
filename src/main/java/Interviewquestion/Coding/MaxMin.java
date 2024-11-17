package Interviewquestion.Coding;


        import java.util.Arrays;
import java.util.List;

        public class MaxMin {
                public static void main(String[] args) {
                        List<Integer> numbers = Arrays.asList(10,15,98,32,65,78,0);
                        int max = numbers.stream().mapToInt(Integer::intValue).max().getAsInt();
                        System.out.println("Maximum number :"+ max);
                        int min = numbers.stream().mapToInt(Integer::intValue).min().getAsInt();
                        System.out.println("Maximum number :"+ min);
                }
        }


