package com.arrays;
public class ArrayMinValue {
	static void min(int arr[]) {
		int min = arr[0];
		for(int j=1;j<arr.length;j++)
		{
			if(min>arr[j]) {
				min = arr[j];
			}
		}
		System.out.println(min);
	}
	public static void main(String[] args) {
		int b[]= {41,24,58,12,05,72,16,35,02,01,25};
		min(b);
	}
}
