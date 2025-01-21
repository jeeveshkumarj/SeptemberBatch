package com.Practice.Arrays;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,4,7,2,5,8,3,6,9,};
		System.out.println("The array elements are:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the search element:");
		int x=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(x==arr[i]) {
				System.out.println("Element found at index:"+i);
				return;
			}
		}
		System.out.println("Element not found");
	}

}
