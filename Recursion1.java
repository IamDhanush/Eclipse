package com.recursion;

public class Recursion1 {
	
	static int count=0;
	public static void r() {
		System.out.println("Hello Vincent!!");
		count++;
		if(count<=3) {
			System.out.println("What's up!!");
			r();
		}
	}
	public static void main(String[] args) {
		r();
	}

}
