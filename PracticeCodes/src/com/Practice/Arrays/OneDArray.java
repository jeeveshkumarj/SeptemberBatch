package com.Practice.Arrays;

import java.util.Scanner;

public class OneDArray {
	static Scanner sc=new Scanner(System.in);
	int arr[];
	int size;
	
	void createArray(int n) {
		size=n;
		arr=new int[n];
		System.out.println("Array is created");
	}
	
	void addData() {
		System.out.println("collecting data");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the marks of student no "+(i+1)+" :");
			arr[i]=sc.nextInt();
		}
		System.out.println("-----------------------");
	}
	
	void display() {
		System.out.println("The Student marks details are:");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Marks of Student no "+(i+1)+" is"+arr[i]);
		}
	}
	
	public static void main(String[] args) {
		OneDArray ob=new OneDArray();
		System.out.println("Enter the student size:");
		int s=sc.nextInt();
		ob.createArray(s);
		ob.addData();
		ob.display();
	}
	
	

}
