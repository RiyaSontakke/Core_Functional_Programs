package com.bridgelab.coreprograms;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		Scanner scan = new Scanner(System.in);	
		System.out.println("Enter a number:");
		int number = scan.nextInt();
		while (number > 1) {
            if (number % i == 0) {
                System.out.println(i);
                number = number / i;
            } 
            else
                i++;
		}
    }			
}
