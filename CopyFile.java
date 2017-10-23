package com.filestream;

import java.io.File;
import java.io.FileOutputStream;

public class CopyFile {

	public static void main(String[] args) throws Exception{
		
		File image = new File("BOSTON.jpg");
		File image2 = new File("boston.jpg");
		FileOutputStream fout = new FileOutputStream(image2);
		byte b [] = new byte[(int)image.length()];
		byte c[] = new byte[(int)image2.length()];
		String s = new String(b);
		for(int i=0;i<b.length;i++) {
			b[i]=c[i];	
			fout.write(b);
		}
		System.out.println(s);
		fout.close();
	}
}
