package com.overriding;

// Supser keyword is the reference of the sub class in java if you want access the parent class varable or datatype in sub class u can use the (super.methodName or super.varableNmae)
public class SuperKeyWord {
	
	public void show() {
		System.out.println("This is the parent class Object");
	}
}
class SubClass extends SuperKeyWord {
	public void show() {
		super.show();
		System.out.println("this is the sub class object");
	}
}
class Test{
	public static void main(String[] args) {
		SubClass sub = new SubClass();
		sub.show();
	}
}