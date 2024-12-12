// Problem Statement:
// You need to write a program that calculates the factorial of a given number.
// The factorial of a number n is the product of all positive integers less 
// than or equal to n.

import java.util.*;

public class Problem_03_Factorial {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int factorial = 1;

        if (number < 0) {
            System.out.println("The number should not be less than zero");
            return;
        }

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial is : " + factorial);
        sc.close();
    }

}
