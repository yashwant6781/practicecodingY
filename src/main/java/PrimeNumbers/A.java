package PrimeNumbers;

import java.util.List;


        import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class A {
    public static void main(String[] args) {
        List<Integer> primes = IntStream.rangeClosed(2, 100)
                .filter(n -> isPrime(n))
                .boxed()
                .collect(Collectors.toList());

        System.out.println(primes);
    }

    // Simplified prime check method
    private static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .allMatch(n -> number % n != 0);
    }
}

