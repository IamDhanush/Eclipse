package com.arrays;
public class Array1{
	int a[]= {1,2,3,4,5,6};
	int i=0;
	void display(){
		while(i<=a.length){ 
			System.out.println(a[i]);	
			i++;
			}
		}
	public static void main(String args[]) {
		Array1 d = new Array1();
		d.display();
}};
