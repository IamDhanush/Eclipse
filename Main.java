package com.polymorphism;

public class Main {

	public static void main(String[] args) {
	Animal list[] = new Animal[2];
	Dog d = new Dog();
	Cat c = new Cat();
	list[0] = d;
	list[1] = c;
	for(Animal k: list) {
		k.noise();
	}
	}
}
