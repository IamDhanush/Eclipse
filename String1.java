package com.strings;

public class String1 {

	public static void main(String[] args) {
		String s = "Dhanush";
		s = s.concat(" Pulyala");
		System.out.println(s);
		for(int i=0,k=0;i<s.length();i++) {
			if(s.charAt(i)=='a') {
				k++;
			if(k==2) {
				System.out.println(i);
			}}
		}}
	}	
