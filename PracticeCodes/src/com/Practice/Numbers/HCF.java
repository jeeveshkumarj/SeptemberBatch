package com.Practice.Numbers;

import java.util.Scanner;

public class HCF {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1 no:");
		int n1=sc.nextInt();
		System.out.println("Enter the 1 no:");
		int n2=sc.nextInt();
		System.out.println("The hcf of 2 nos is");
		findHcf(n1,n2);
		
	}
	static void findHcf(int n1,int n2) {
		for(int i=n1; i>=1;i--) {
			if(n1%i==0 && n2%i==0) {
				System.out.println(i);
				break;
			}
		}
	}

}
