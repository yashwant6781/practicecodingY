package Java8.OptionalClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class A {
    public static void main(String[] args) {


        List<String> names = Arrays.asList("mike", null, "tom");
        names.stream().map(name->Optional.ofNullable(name).orElse("unknown value")).forEach(System.out::println);
    }

}