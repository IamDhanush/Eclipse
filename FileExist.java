package com.files;

import java.io.File;

public class FileExist {

	public static void main(String[] args) {
	File x = new File("C:\\Users\\Dracut Convenience\\Desktop");
	if(x.exists()) {
		System.out.println(x+" file Exist.");
	}
	else {
		System.out.println("This file doen't exist.");
	}
	}

}
