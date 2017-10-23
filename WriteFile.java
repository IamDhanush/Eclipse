package com.filestream;

import java.io.File;
import java.io.FileOutputStream;

public class WriteFile{

	public static void main(String[] args) throws Exception {
		File file = new File("Test.txt");
		FileOutputStream fout = new FileOutputStream(file);
		String s = "This is the file which is written.";
		byte[] b= s.getBytes();;
		fout.write(b);
		System.out.println("File has created.");
		fout.close();
	}
}