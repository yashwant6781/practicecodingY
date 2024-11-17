package Duplicatecharacter;


public class Main {
    public static void main(String[] args) {
        String input = "programming";
        int[] count = new int[256];  // ASCII size

        // Count frequency of each character
        for (char c : input.toCharArray()) {
            count[c]++;
        }

        // Print duplicate characters
        System.out.println("Duplicate characters:");
        for (int i = 0; i < 256; i++) {
            if (count[i] > 1) {
                System.out.println((char) i + " appears " + count[i] + " times.");
            }
        }
    }
}
