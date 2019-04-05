package com.dynamicPolymarphism;

// when the object is determine Runtime it is called as dynamic polymarphism
// exe :  without static method and final and private 

public class Animal {
	void eat() {
		
	System.out.println("Eating grass");
	}
}
class Dog extends Animal{
	void eat() {
		super.eat();
		System.out.println("eating meat");
	}
}
	class Test{
		public static void main(String[] args) {
			Dog d = new Dog();
			d.eat();
		}
	}