package com.calculator;
import java.util.Scanner;

public class Cal2 {
	static float a,b,c;
	static int opt;
	private static Scanner sc;
	public static void main(String[] args) {
		Cal1 cal = new Cal1();
		sc = new Scanner(System.in);
		for(;;) {
		System.out.println("Enter the value for a: " );
		a = sc.nextFloat();
		System.out.println("Enter the value for b: " );
		b = sc.nextFloat();
		System.out.println("Select any of the following: \n 1. Addition\n 2. Subtraction\n 3. Division\n 4. Multiplication\n 5. End\n" );
		opt = sc.nextInt();
		if(opt > 5) {
			System.out.println("Please enter the correct option");
		}
		else if(opt ==1) {
			c = cal.add(a, b);
			System.out.println("For, " +a+ " and " +b+" Addition is: "+c);
		}
		else if(opt ==2) {
			c = cal.sub(a, b);
			System.out.println("For, "+a+" and "+b+" Subtraction is: "+c);
		}
		else if(opt ==3) {
			c = cal.div(a, b);
			System.out.println("For, "+a+" and "+b+" Division is: "+c);
		}
		else if(opt ==4) {
			c = cal.mul(a, b);
			System.out.println("For, "+a+" and "+b+" Multiplication is: "+c);
		}
		else if(opt ==5){
			System.out.println("Program Ended..");
			break;
		}
		}	}
	}
