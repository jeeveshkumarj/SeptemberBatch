package com.Practice.Strings;

import java.util.*;
public class TotVowels {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		s=s.toLowerCase();
		int count=0;
		System.out.println("The vowel characters in the string are:");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				count++;
				System.out.print(s.charAt(i)+" ");
			}
		}
		System.out.println();
		System.out.println("The no of vowels are:"+count);
	}

}
