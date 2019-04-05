package com.runtimePolymarphism;

public class Animal {
	void eat() {
		System.out.println("eating");
	}
}
class Dog extends Animal{
	void eat() {
		super.eat();
		System.out.println("eating bread");
	}
}
class Cat extends Animal{
	void eat() {
		System.out.println("eat rat");
		
	}

}

class Lion extends Animal {
	void eat() {
	System.out.println("eating meat ");
}
}
class Demo{
	public static void main(String[] args) {
		Animal a;
		a=new Dog();
		a.eat();
		a=new Cat();
		a.eat();
		a= new Lion();
		a.eat();
	
}
}

