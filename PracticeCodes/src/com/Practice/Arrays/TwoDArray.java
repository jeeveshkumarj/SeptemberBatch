package com.Practice.Arrays;

import java.util.Scanner;

public class TwoDArray {
	static Scanner sc=new Scanner(System.in);
	int arr[][];
	int cls;
	int stu;
	
	void createArray(int m,int n) {
		cls=m;
		stu=n;
		arr=new int[m][n];
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
		System.out.println("displaying data");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside class no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
			System.out.println("the marks of student no "+(i+1)+":"+arr[i][j]);
	
			}
		}
	}
	
	public static void main(String[] args) {
		TwoDArray ob=new TwoDArray();
		System.out.println("Enter the class size:");
		int c=sc.nextInt();
		System.out.println("Enter the student ssize:");
		int s=sc.nextInt();
		ob.createArray(c,s);
		ob.addData();
		ob.display();
	}

}
