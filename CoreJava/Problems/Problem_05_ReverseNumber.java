import java.util.*;

public class Problem_05_ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter number to  reverse");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10; // This will extract the last digit.
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println("The reversed number is : " + reversed);
        sc.close();
    }
}