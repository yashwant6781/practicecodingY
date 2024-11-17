package Java8.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class A {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(12,5,8,98,56,266,25,59);
        List<Integer> newData= data.stream().sorted().collect(Collectors.toList());
        System.out.println(newData);
    }
}