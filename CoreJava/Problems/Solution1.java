import java.util.*;
import java.util.stream.Collectors;

public class Solution1 {

    public static List<String> checkStrings(String binary, List<String> strings) {
        // Validate the binary string
        if (binary == null || binary.isEmpty()) {
            return Collections.emptyList();
        }

        // Ensure the binary string contains only '0' and '1'
        if (!binary.matches("[01]+")) {
            throw new IllegalArgumentException("Invalid binary string. Only '0' and '1' are allowed.");
        }

        // Count the number of '1's in the binary string
        long onesCount = binary.chars().filter(ch -> ch == '1').count();

        // Filter strings based on their lengths matching the count of '1's
        return strings == null
                ? Collections.emptyList()
                : strings.stream()
                        .filter(s -> s.length() == onesCount)
                        .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(checkStrings("10101", Arrays.asList("hello", "world", "hi", "abc", "yes"))); // Expected:
                                                                                                        // [abc, yes]
        System.out.println(checkStrings("0000", Arrays.asList("a", "bb", "ccc"))); // Expected: []
        System.out.println(checkStrings("", Arrays.asList("a", "bb", "ccc"))); // Expected: []
        System.out.println(checkStrings("111", Arrays.asList("a", "bb", "ccc", "dddd"))); // Expected: [ccc]
        System.out.println(checkStrings("1111", Collections.emptyList())); // Expected: []

        // Invalid binary string
        try {
            System.out.println(checkStrings("1012abc", Arrays.asList("a", "bb", "ccc"))); // Expected: Exception
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
