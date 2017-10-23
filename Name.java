package com.strings;
import java.util.Scanner;

public class Name {
	
	private static Scanner sc;
	private static String s;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Hello There!! My name is Computer. What is your name??");
		s = sc.nextLine();
		System.out.println("Hey " +s+"!!. How're you doing there?!");
		sc.nextLine();
		System.out.println("Great...I guess.");
		sc.nextLine();
		System.out.println("I'm just a computer. I depise feelings!!!");
		sc.nextLine();
		System.out.println("I'm not your servant, you old sot!");
		sc.nextLine();
		System.out.println("Well good. Now get out of my face before I knock you out you ugly git!");
	}
}


