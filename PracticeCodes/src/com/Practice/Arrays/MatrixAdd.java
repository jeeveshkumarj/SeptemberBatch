package com.Practice.Arrays;

import java.util.Scanner;

public class MatrixAdd {
	static Scanner sc= new Scanner(System.in);
	int arr1[][];
	int arr2[][];
	int sum[][];
	int row; 
	int col;
	
	void createArray(int m, int n) {
		row=m;
		col=n;
		arr1=new int[m][n];
		arr2=new int[m][n];
		sum=new int[m][n];
		System.out.println("Arrays of size ("+m+"X"+n+") created ");
	}
	void addElement() {
		System.out.println("Enter the first array elements:");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.println("Enter the ("+i+","+j+") element:");
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the second array elements:");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.println("Enter the ("+i+","+j+") element:");
				arr2[i][j]=sc.nextInt();
			}
		}
	}
	
	void add() {
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				sum[i][j]=arr1[i][j]+ arr2[i][j];
			}
		}

	}
	void display() {
		System.out.println("The 1 array is:");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The 2 array is:");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The sum  array is:");
		for(int i=0;i<sum.length;i++) {
			for(int j=0;j<sum[i].length;j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		MatrixAdd m=new MatrixAdd();
		System.out.println("Enter the row size:");
		int r=sc.nextInt();
		System.out.println("Enter the col size:");
		int c=sc.nextInt();
		m.createArray(r, c);
		m.addElement();
		m.add();
		m.display();
	}

}
