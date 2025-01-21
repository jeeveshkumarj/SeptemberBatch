package com.Practice.Numbers;

import java.util.Scanner;

public class SumOfGivenRange {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1 no:");
		int n1=sc.nextInt();
		System.out.println("Enter the 2 no:");
		int n2=sc.nextInt();
		int sum=0;
		for(int i=n1;i<=n2;i++) {
			sum=sum+i;
		}
		System.out.println("The sum of given range is:"+sum);
		
	}

}
