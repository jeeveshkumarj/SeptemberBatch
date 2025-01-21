package com.Practice.Numbers;

import java.util.Scanner;

public class SumOfFirstNumbers {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no:");
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("The sum is:"+sum);

	}
}
