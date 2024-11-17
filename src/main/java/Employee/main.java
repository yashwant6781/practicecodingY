package Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class main {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 60000),
                new Employee("Bob", 45000),
                new Employee("Charlie", 52000),
                new Employee("David", 70000)
        );

        // Filter and sort
        employees.stream()
                .filter(e -> e.salary > 50000)
                .sorted(Comparator.comparing(e -> e.name))
                .forEach(System.out::println);
    }
}