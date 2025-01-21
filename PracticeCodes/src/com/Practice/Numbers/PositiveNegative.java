package com.Practice.Numbers;

import java.util.Scanner;

public class PositiveNegative {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no:");
		int n=sc.nextInt();
		if(n>0) {
			System.out.println("Positive");
		}
		else {
			System.out.println("Negative");
		}
	
	
	}
}
