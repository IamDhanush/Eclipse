package com.callbyvalue;
public class CallByReference {
int data1 = 100;
void changemethod2(CallByReference c2) {
	data1 = data1+100;
}
  public static void main(String[] args) {
		CallByReference c2 = new CallByReference();
		System.out.println(c2.data1);
		c2.changemethod2(c2);
		System.out.println(c2.data1);
	}
}
