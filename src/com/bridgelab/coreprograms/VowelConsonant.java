package com.bridgelab.coreprograms;

import java.util.Scanner;

public class VowelConsonant {
	public static void main(String[] args) {
		char ch;
		System.out.println("Enter any character");
		Scanner scan = new Scanner(System.in);
		ch = scan.next().charAt(0);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			System.out.println( "vovel : " +ch);
		else
			System.out.println("consonant : " +ch);
		
	}
}
