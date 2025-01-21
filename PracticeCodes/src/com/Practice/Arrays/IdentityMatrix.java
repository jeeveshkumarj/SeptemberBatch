package com.Practice.Arrays;

import java.util.Scanner;

public class IdentityMatrix {
	static Scanner sc= new Scanner(System.in);
	int arr[][];
	int size; 

	
	void createArray(int n) {
		size=n;
		arr=new int[n][n];
		System.out.println("Arrays of size ("+n+"X"+n+") created ");
	}
	void collectData() {
		System.out.println("Enter the first array elements:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the ("+i+","+j+") element:");
				arr[i][j]=sc.nextInt();
			}
		}
	}
	
	
	boolean isIdentity() {
		for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j && arr[i][j] != 1) {
                    return false; // Diagonal elements should be 1
                } else if (i != j && arr[i][j] != 0) {
                    return false; // Non-diagonal elements should be 0
                }
            }
        }
        return true;
	}
	
	void display() {
		System.out.println("The  array is:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		if(isIdentity()) {
			System.out.println("given matrix is Identity matrix");
		}
		else {
			System.out.println("Not an identity matrix");
		}
		
	}
	
	public static void main(String[] args) {
		IdentityMatrix m=new IdentityMatrix();
		System.out.println("Enter the row and col size:");
		int rc=sc.nextInt();
		m.createArray(rc);
		m.collectData();
		m.isIdentity();
		m.display();
	}

}