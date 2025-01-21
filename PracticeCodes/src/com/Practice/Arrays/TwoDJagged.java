package com.Practice.Arrays;

import java.util.Scanner;

public class TwoDJagged {
	static Scanner sc=new Scanner(System.in);
	int arr[][];
	int cls;
	int stu;
	
	void createArray(int m) {
		cls=m;
		arr=new int[m][];
		System.out.println("Creating student for each class:");
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the student count inside class no "+(i+1));
			stu=sc.nextInt();
			arr[i]=new int[stu];
		}
		System.out.println("Array is created");
	}
	
	void addData() {
		System.out.println("collecting data");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside class no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
			System.out.println("Enter the marks of student no "+(i+1)+" :");
			arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("-----------------------");
	}
	
	void display() {
		System.out.println("collecting data");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside class no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
			System.out.println("the marks of student no "+(i+1)+":"+arr[i][j]);
	
			}
		}
	}
	
	public static void main(String[] args) {
		TwoDJagged ob=new TwoDJagged();
		System.out.println("Enter the class size:");
		int c=sc.nextInt();
		ob.createArray(c);
		ob.addData();
		ob.display();
	}

}
