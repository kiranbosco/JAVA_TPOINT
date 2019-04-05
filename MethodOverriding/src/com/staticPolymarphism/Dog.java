package com.staticPolymarphism;

public class Dog {
	
	// when the object is determine  the compile time it is known as static binding
	// Exe : stati if there is any private static final method in the class there is the static binding
	
	private void eat() {
		System.out.println("This is the static polymarphism");
	}
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		
	}

}
