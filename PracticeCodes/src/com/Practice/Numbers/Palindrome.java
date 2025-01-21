package com.Practice.Numbers;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the  no:");
		int n=sc.nextInt();
		int rev=0;
		int rem;
		int n1=n;
		while(n!=0) {                 //123..........12..........1
			rem=n%10;                //3............2...........1
			rev= (rev*10)+rem;       //3......(30+2)=32.....(320+1)=321
			n=n/10;		              //12.......1...............0
		}
		System.out.println("Reverse of a number is:"+rev);
		if(rev==n1) {
			System.out.println("Palindrome number");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

}
