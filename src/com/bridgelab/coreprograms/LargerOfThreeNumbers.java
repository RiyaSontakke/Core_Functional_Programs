package com.bridgelab.coreprograms;

public class LargerOfThreeNumbers {
	public static void main(String[] args) {
		int num1 = 10, num2 = 30, num3 = 20;
		if(num1>num2 && num1>num3)
		{
			System.out.println("num1 is greater" );
		}
		else if (num2>num3)
		{
			System.out.println("num2 is greater" );
		}
		else
		{
			System.out.println("num3 is greater" );
		}
	}

}
