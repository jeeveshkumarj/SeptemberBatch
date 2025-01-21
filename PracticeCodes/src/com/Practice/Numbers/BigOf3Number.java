package com.Practice.Numbers;

import java.util.Scanner;

public class BigOf3Number {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1 no:");
		int n1=sc.nextInt();
		System.out.println("Enter the 2 no:");
		int n2=sc.nextInt();
		System.out.println("Enter the 3 no:");
		int n3=sc.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.println(n1+" is big");
		}
		else if(n2>n3) {
			System.out.println(n2+" is big");
		}
		else {
			System.out.println(n3+" is big");
		}
	}

}
