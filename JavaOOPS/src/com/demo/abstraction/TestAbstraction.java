package com.demo.abstraction;

// Abstract class
abstract class Animal {
	// Abstract method (does not have a body)
	public abstract void animalSound();
	// Regular method
	public void sleep() {
		System.out.println("Zzz");
	}
}

// Subclass (inherit from Animal)
class Cat extends Animal {
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The Cat says: Meu Meu");
	}
}


public class TestAbstraction {

	public static void main(String[] args) {
		Animal cat = new Cat();
		cat.animalSound();
	}
}
