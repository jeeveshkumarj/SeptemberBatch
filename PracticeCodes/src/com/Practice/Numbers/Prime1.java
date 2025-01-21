package com.Practice.Numbers;

import java.util.Scanner;

public class Prime1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		if(n==0 || n==1) {
			System.out.println(n+" is not a prime number");
			return;
		}
		checkPrime(n);
	}
	static void checkPrime(int n) {
		int count=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==0) {// prime will have only 2 factors
			System.out.println(n+ " is a prime no");
		}
		else {
			System.out.println(n+"  is not a prime no");
		}
	}

}
