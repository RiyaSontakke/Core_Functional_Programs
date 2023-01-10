package com.bridgelab.coreprograms;

import java.util.Scanner;

public class HarmonicSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        System.out.println("Enter a number");
	        int num = scan.nextInt();
	        double result = 0.0;
	        for (int i = 1; i <= num; i++) {
	            result = result + (double) 1 / i;
	        }
	        System.out.print(num + "th Harmonic Number is " + result);
	        }
}


