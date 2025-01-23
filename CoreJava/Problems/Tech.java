// Write a program to display those starting with A and having length of 3 
//characters in Java 8.

//String s[] = {"AB", "ABC", "BC", "BCD", "AAA", "BBB"}

import java.util.Arrays;

public class Tech {
    public static void main(String[] args) {
        String strings[] = { "AB", "ABC", "BC", "BCD", "AAA", "BBB" };

        Arrays.stream(strings)
                .filter(s -> s.startsWith("A") && s.length() == 3)
                .forEach(System.out::println);
    }
}