package com.files;

import java.io.File;
import java.util.Scanner;

public class FileRead {

	private Scanner sc;
	
	public void openfile() {
		try {
		sc = new Scanner(new File("C:\\Users\\Dracut Convenience\\Dhanush.txt"));
	}
		catch(Exception e){
		System.out.println("Some error occured.");
	}}
		public void readFile() {
			while(sc.hasNext()) {
				String a = sc.next();
				String b = sc.next();
				String c = sc.next();
				
				System.out.printf("%s %s %s", "a","b","c");
			}
		}	
		public void closeFile() {
			sc.close();
		}
	}

