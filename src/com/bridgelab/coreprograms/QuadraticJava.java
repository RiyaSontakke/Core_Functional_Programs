package com.bridgelab.coreprograms;

import java.util.Scanner;

public class QuadraticJava {
	public static void main(String[] args) {
		double root1=0, root2=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 'a' value");
        int a =sc.nextInt();
        System.out.println("enter the 'b' value");
        int b = sc.nextInt();
        System.out.println("enter the 'c' value");
        int c = sc.nextInt();
        double delta = Math.pow(b,2)-4*a*c;
        if(delta > 0)
        {
            root1 = (-b + Math.sqrt(delta))/(2*a);
            root2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("roots are: " +root1+ " , " +root2);
        }
        else if (delta == 0)
        {
        double root = -b/2*a;
            System.out.println("root is " +root);
        }
        else {
            System.out.println("roots are not correct");
        }
	}

}
