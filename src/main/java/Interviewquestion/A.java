package Interviewquestion;
import java.util .*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;

public class A {





        public static void main(String[] args) {
            List<String> words = Arrays.asList("pappya", "orange", "orange", "mango", "apple", "apple");
            Map<String, Long> wordCount = countWords(words);

            // Print the result
            System.out.println(wordCount);
        }

        public static Map<String, Long> countWords(List<String> words) {
            return words.stream()
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        }
    }



