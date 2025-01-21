package com.Practice.Arrays;

import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("The array elements are:");              //1 4 2 3 5
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println("The sum of array elements are:"+sum);
		
	}

}
