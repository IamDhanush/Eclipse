package com.filestream;

import java.io.File;
import java.io.FileWriter;

public class FileAppend {

	public static void main(String[] args) throws Exception{
		File file1 = new File("Dhanush.txt");
		FileWriter fw2 = new FileWriter(file1, true);
		String s = "And, some more is coming.";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
		fw2.append(c);
		}
		fw2.close();
}
}