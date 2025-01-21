package com.Practice.Numbers;

import java.util.Scanner;

public class PrimeFactors {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		primeFactors(n);
		
	}
	static void primeFactors(int n){
		for(int i=2;i<=n;i++) {
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
