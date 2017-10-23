package com.exercise;

public class Mammal implements Dog,Donkey {

	public void name() {
		System.out.println("This is a Mammal..");
	}
	public void weight() {
		Dog.super.weight();
	}
}
