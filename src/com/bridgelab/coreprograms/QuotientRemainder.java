package com.bridgelab.coreprograms;

import java.util.Scanner;

public class QuotientRemainder {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int number1 = scan.nextInt();
		System.out.println("Enter the second number:");
		int number2 = scan.nextInt();
		int quotient = number1 / number2;
		int remainder = number1 % number2;
		System.out.println("Quotient:" +quotient);
		System.out.println("Remainder:" +remainder);
	}

}
