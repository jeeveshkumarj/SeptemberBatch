package com.Practice.Numbers;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the  no:");
		int n=sc.nextInt();
		if(isPrime(n)) {
			System.out.println("prime");
		}
		else {
			System.out.println("not a prime");
			
		}
	}

	private static boolean isPrime(int n) {
		if(n==0 | n==1) {
			return false;
		}
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}

}
