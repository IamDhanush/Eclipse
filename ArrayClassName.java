package com.arrays;

public class ArrayClassName {

	public static void main(String[] args) {
	int a[] = {3,4,5};
	Class<? extends int[]> c = a.getClass();
	String name = c.getName();
System.out.println(name);
	}

}
