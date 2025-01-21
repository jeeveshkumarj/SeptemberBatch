package com.Practice.Numbers;

import java.util.Scanner;

public class PrimeFirstNNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printPrime(n);
		
	}
	static void printPrime(int n){
		int count=0;
		for(int i=2;count<n;i++) {
			if(isPrime(i)) {
				System.out.println(i);
				count++;
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
