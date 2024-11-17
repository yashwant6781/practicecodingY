package Java8.FunctionalInterface.Predicate;

import java.util.function.Predicate;

public class C {
    public static void main(String[] args) {
        Predicate<Integer> val=x->x%2==0;
        boolean result=val.test(100);
        System.out.println(result);
    }
}
