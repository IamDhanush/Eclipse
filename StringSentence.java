package com.strings;

public class StringSentence {

	public static void main(String[] args) {
		String sentence = "Vishal is a Pro Badminton Player.";
		sentence = sentence.concat("Dhanush is an Amateur Badminton Player.");
		System.out.println(sentence);
		for(int i=0,l=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' '&&sentence.charAt(i+1)=='i'&& sentence.charAt(i+2)=='s'  ) {
				l++;
				if(l==2) {
					System.out.println(sentence.charAt(i));
				}
			}	
			}
		}
	}

