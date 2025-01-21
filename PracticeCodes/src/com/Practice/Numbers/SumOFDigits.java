package com.Practice.Numbers;

import java.util.Scanner;

public class SumOFDigits {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the  no:");
		int n=sc.nextInt();
		int sum=0;
		int rem;
		while(n!=0) {   //123.....12...........1
			rem=n%10;   // 3.......2...........1
			sum=sum+rem;//3+2+1
			n=n/10;      //12.........1..........0
		}
		System.out.println("The sum of numbers are:"+sum);
	}
	
}
