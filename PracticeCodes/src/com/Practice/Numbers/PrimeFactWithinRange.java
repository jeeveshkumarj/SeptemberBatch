package com.Practice.Numbers;

import java.util.Scanner;

public class PrimeFactWithinRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no1 :");
		int n1=sc.nextInt();
		System.out.println("enter no2:");
		int n2=sc.nextInt();
		printPrime(n1,n2);
		
	}
	static void printPrime(int n1,int n2){
		for(int i=n1;i<=n2;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	private static boolean isPrime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	

}
