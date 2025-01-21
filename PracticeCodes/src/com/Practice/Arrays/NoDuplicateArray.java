package com.Practice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NoDuplicateArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array elements are:");
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+ " ");
		}
		int temp[]=new int[n];  //temporary array
		int unqcount=0;
		                       //[1 1 2 2 3 4 5 6]
		temp[unqcount]=arr[0];// first element in sorted array is unique ............. temp[0]=1
		unqcount++;           // unqcount=1  
		
		for(int i=1;i<n;i++) {
			if(arr[i]!=arr[i-1]) {
				temp[unqcount]=arr[i];
				unqcount++;
			}
		}
		int unqArray[]=new int[unqcount];
		for(int i=0;i<unqcount;i++) {
			unqArray[i]=temp[i];
		}
		System.out.println("The unique elemennt array is:");
		for(int i=0;i<unqcount;i++) {
			System.out.println(unqArray[i]+" ");
		}	
	}

}
