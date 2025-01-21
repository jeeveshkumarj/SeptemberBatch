package com.Practice.Strings;

import java.util.*;
public class WordCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		s=s.trim();
		int wc=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
				wc++;
			}
		}
		System.out.println("The no of words are: "+(wc+1));
	}
}
