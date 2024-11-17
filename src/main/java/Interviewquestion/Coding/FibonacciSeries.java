package Interviewquestion.Coding;

import java.util.stream.Stream;

public class FibonacciSeries {

        public static void main(String[] args) {
            int n = 20; // Number of Fibonacci numbers to generate

            Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
                    .limit(n)
                    .map(f -> f[0])
                    .forEach(System.out::println);
        }
    }


