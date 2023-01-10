package com.bridgelab.coreprograms;

public class WindChillJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Fahrenheit = 50;
        int windSpeed = 110;
        if(Math.abs(Fahrenheit) > 50 || windSpeed > 120 || windSpeed < 3 ){
            System.out.println("enter correct input");
        }
        else {
            double w = 35.74 + (0.62158 * Fahrenheit) + (((0.4275 * Fahrenheit)- 35.75) * Math.pow(windSpeed, 0.16));
            System.out.println(w);
        }

	}

}
