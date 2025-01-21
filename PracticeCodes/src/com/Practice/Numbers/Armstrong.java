package com.Practice.Numbers;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int originalNumber = n;
        int sum = 0;
        int digcount=String.valueOf(n).length();

        while (n != 0) {
            int rem = n % 10;   // Extract the last digit
            sum =(int) (sum +  Math.pow(rem, digcount)); 
            n =n/ 10;             // Remove the last digit
        }

        // Check if the sum equals the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

    }
}

