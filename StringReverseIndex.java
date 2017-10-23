package com.strings;

public class StringReverseIndex {

	public static void main(String[] args){
		
		String a = "12BHAGATH";
		String b = new StringBuilder(a).reverse().toString();
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<a.length();i++) {
		if(a.charAt(i)==b.charAt(i)) {
			System.out.println("Check for the common character where index is same: "+b.charAt(i));	
	 }
	 }
	}
}

