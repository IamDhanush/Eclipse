package com.javatpoint;

class A{
 static int method1(int a) {
		return a*a;
	}} 
class B{
	static int method2(int b) {
		return b*b*b;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		System.out.println(A.method1(5));
		System.out.println(B.method2(5));
	}

}
