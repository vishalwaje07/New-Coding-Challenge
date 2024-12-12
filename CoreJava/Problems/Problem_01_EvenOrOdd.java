// Problem Statement:
// You need to write a program that reads an integer from the user and 
// determines whether the number is even or odd.

import java.util.Scanner;

public class Problem_01_EvenOrOdd {
    public static void main(String[] args) {

        try (// Created a scanner object to read input
                Scanner sc = new Scanner(System.in)) {
            // Asked user to enter a number
            System.out.println("Enter a number");
            int number = sc.nextInt();

            // Check the number is even or odd.
            if (number % 2 == 0) {
                System.out.println("The given number is even");
            } else {
                System.out.println("The number is odd");
            }
        }
    }
}