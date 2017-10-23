package com.arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		char[]a= {'b','d','i','s','n','e','y','w','o','r','l','d','k'};
		char[]b= new char[11];
		System.arraycopy(a, 1, b, 0, 11);
		System.err.println(new String(b));
	}
}
