package com.filestream;

import java.io.File;
import java.io.FileWriter;

public class FileWrite {
	
	public static void main(String[] args) throws Exception {
		
		File file3 = new File("Dhanush.txt");
		FileWriter fw = new FileWriter(file3);
		String s = "Hello!! My name is Dhanush.";
		fw.write(s);
		fw.close();
	}
}