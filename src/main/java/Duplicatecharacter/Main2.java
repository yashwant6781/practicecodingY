package Duplicatecharacter;




import java.util.*;


import java.util.HashMap;

    public class Main2 {
        public static void main(String[] args) {
            String input = "ganesh yashwant";
            HashMap<Character, Integer> map = new HashMap<>();

            // Count frequency of each character
            for (char c : input.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            // Print duplicate characters
            System.out.println("Duplicate characters:");
            for (char c : map.keySet()) {
                if (map.get(c) > 1) {
                    System.out.println(c + " appears " + map.get(c) + " times.");
                }
            }
        }
    }

