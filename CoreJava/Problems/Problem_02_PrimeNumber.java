// Problem Statement:

// You need to write a program that checks if a given number is prime. 
// A prime number is a number that is greater than 1 and is divisible only 
// by 1 and itself.

import java.util.*;

public class Problem_02_PrimeNumber {
    public static void main(String[] args) {

        // Scanner object for taking the input
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        if (number <= 1) {
            System.out.println(number + ": is not prime number");
            return;
        }

        // Loop to check the number is prime or not
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println(number + " : is not prime number");
                return;
            }
        }
        System.out.println(number + " : is prime ");
        sc.close();
    }

}
