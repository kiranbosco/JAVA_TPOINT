package com.staticb;


// Question :- How do you know is it static  binding or dynamic binding
// Ans :- there is any private or static or final in front of data type ur found it is called as the static binding
public class Dog {
	private void eat() {
		System.out.println("eating biscut");
	}
}
class Lion extends Dog {
	void eat() {
	//	super.eat();   private method not inherited 
		System.out.println("eating meat");
	}
}

class Demo{
	public static void main(String[] args) {
		Lion d = new Lion();
		d.eat();
		
	}

}
