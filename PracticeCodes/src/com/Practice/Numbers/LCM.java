package com.Practice.Numbers;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		findLcm(n1,n2);
		
	}

	private static void findLcm(int n1, int n2) {
		int hcf=0;
		for(int i=n1; i>=1;i--) {
			if(n1%i==0 && n2%i==0) {
				hcf=i;
				break;
			}
		}
		int lcm=(n1*n2)/hcf;
		System.out.println(lcm);
	}

}
