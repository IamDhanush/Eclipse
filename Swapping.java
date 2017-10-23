package com.bhagath;
public class Swapping {
	
	int a,b;
	
	public Swapping(int a , int b) {
		this.a =a;
		this.b =b;
		}
	
	public static void Swap(Swapping S) { 
        S.a = S.a+S.b;
        S.b = S.a-S.b;
        S.a = S.a-S.b; 
	}
	
	public static void main(String[] args){
		Swapping a1 = new Swapping(4,5);
		Swapping a2 = new Swapping(6,8);
		System.out.println("a value before swap for object a1:"+a1.a);
		System.out.println("b value before swap for object a1:"+a1.b);
		System.out.println("a value before swap for object a2:"+a2.a);
		System.out.println("b value before swap for object a2:"+a2.b);
		Swap(a1);
		Swap(a2);
		System.out.println("---------------------------------------");
		System.out.println("a value after swap for object a1:" +a1.a);
		System.out.println("b value after swap for object a1:" +a1.b);
		System.out.println("a value after swap for object a2:" +a2.a);
		System.out.println("b value after swap for object a2:" +a2.b);
	}
}
