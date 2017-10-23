package com.exercise;

public interface Donkey extends Animal{

	default void name() {
		System.out.println("This animal is a Donkey..");
	}
	default void weight() {
		System.out.println("This animal weighs about 200-350lbs");
	}
}
