package com.Practice.Arrays;

import java.util.Arrays;
import java.util.Scanner;


public class ArraySort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The array elements are:");              //1 4 2 3 5
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println("The sorted array elements are:");
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {            //1>4 f.....1>2 f........4>2   t
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
			
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

		
	}

}
