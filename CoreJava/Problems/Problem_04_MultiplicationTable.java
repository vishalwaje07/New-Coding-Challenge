
// Problem Statement:
// You need to write a program that takes a number as input and generates 
// a multiplication table for that number.
import java.util.*;

public class Problem_04_MultiplicationTable {
    public static void main(String[] args) {

        // Scanner object to take the imput
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        // Generates the multiple table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }

        sc.close();
    }

}
