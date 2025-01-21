package com.Practice.Numbers;

public class Practice {
    public static void main(String[] args) {
    	int n=1;
    	int t=1;
    	for(int i=1;i<=100;i+=2) {
    		n=n+i;
    		if(n%2==0) {
    			t=n-(n*2);
    			System.out.print(t+" ");
    		}
    		else {
    			System.out.print(n+" ");
    		}
    	}
    	
    
    }
 }
