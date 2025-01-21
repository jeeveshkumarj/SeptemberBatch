package com.Practice.Arrays;

import java.util.Scanner;

public class SecBiggest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int big=Integer.MIN_VALUE;
		int sbig=Integer.MIN_VALUE;
		System.out.println("The array elements are:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println("--------------------------------");
		for(int i=0;i<n;i++) {
			if(arr[i]>big) {
				sbig=big;
				big=arr[i];
			}
			else if(arr[i]>sbig && arr[i]!=big) {
				sbig=arr[i];
			}
			
		}
		System.out.println("The second biggest element is:"+sbig);
		
		
		
	}


}
