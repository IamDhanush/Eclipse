package com.callbyvalue;

public class CallByValue1 {
int data = 100;
	void changemethod(int data) {
		data = data + 100;
	}
	public static void main(String[] args) {
	
CallByValue1 c1 = new CallByValue1();
System.out.println(c1.data);
c1.changemethod(500);
System.out.println(c1.data);
	}
}
