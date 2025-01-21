package com.Practice.Arrays;

import java.util.Scanner;

public class Duplicate{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int count=1;
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}
			else {
				if(count>1) {
					System.out.println(arr[i]);
				}
				count=1;
			}
		}
		if(count>1) {
			System.out.println(arr[n-1]);
		}
		
	}

}
