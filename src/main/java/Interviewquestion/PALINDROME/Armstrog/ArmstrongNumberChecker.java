package Interviewquestion.PALINDROME.Armstrog;


import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int sum = 0;

        // Calculate the sum of the cubes of each digit
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += digit * digit * digit;
            originalNumber /= 10;
        }

        // Check if the number is an Armstrong number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }
}

