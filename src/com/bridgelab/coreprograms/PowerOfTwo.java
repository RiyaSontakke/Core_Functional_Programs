package com.bridgelab.coreprograms;

public class PowerOfTwo {
	public static void main(String[] args) {
		int num = 31;
		int value;
		if(num >= 0 && num <= 31) {
			value = (int)(Math.pow(2, num));
			System.out.println(value);
			for(int i = 1; i <= num; i++) {
				System.out.println("Power of 2^" + i + " is:" + (Math.pow(2, i)));
				
			}
		}
		else {
			System.out.println("number is not in range give number from 0 to 30 next time ");
		}
		
	}
}

