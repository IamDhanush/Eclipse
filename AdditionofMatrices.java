package com.arrays;
public class AdditionofMatrices {
	public static void main(String[] args) {
		int a[][]= {{4,2,3},{4,5,6}};
		int b[][]= {{7,8,9},{9,8,7}};
		int c[][]= new int[2][3];
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+"  ");
			}
		System.out.println(   );}
	}
}