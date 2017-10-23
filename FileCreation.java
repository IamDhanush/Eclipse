package com.files;
import java.util.*;

public class FileCreation {

	public static void main(String[] args) {
		final Formatter x;
		
		try {
			x = new Formatter("C:\\Users\\Dracut Convenience\\Dhanush.txt");
			System.out.println("File has created. ");
		}
		catch(Exception e) {
			System.out.println("There is an error");
		}
	}
}
