package com.filestream;
import java.io.File;
import java.io.FileInputStream;

public class ReadFile {

	public static void main(String[] args) throws Exception {
		
		File file2 = new File("Test2.txt");
		FileInputStream fin = new FileInputStream(file2);	
		byte[] b = new byte[(int)file2.length()];
		fin.read(b);
		String s = new String(b);
		System.out.println(s);
		fin.close();
	}
}