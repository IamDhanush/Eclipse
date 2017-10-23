package com.javatpoint;
class A1{
	void method1() {
		System.out.println("This is Method1 of Class A");
	}
	void method2() {
		System.out.println("This is Method2 of Class A");
	}
}
class B1 extends A1{
void method1() {
	System.out.println("This is Method1 of Class B");
}	
}

public class MethodOverriding {

	public static void main(String[] args) {
		B1 c = new B1();
		c.method1();
		c.method2();
	}

}
