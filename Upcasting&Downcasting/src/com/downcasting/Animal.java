package com.downcasting;
/*
public class Animal {

}
class Dog4 extends Animal{

	static void method(Animal a) {
		Dog4 d = (Dog4)a;
		System.out.println("down casting successfully");
	}
	public static void main(String[] args) {
		Animal an = new Dog4();
		Dog4.method(an);
	}
}
 */

/*class Animal {
	void eat() {
		System.out.println("eating somthing");

	}
}
class Dog extends Animal{
	void run(Animal a) {
		super.eat();
		Dog d =(Dog)a;
		System.out.println("dog bow bow bow ");
	}
	public static void main(String[] args) {
		Dog dd = new Dog();	
		dd.run(dd);		
	}
}
*/

//downCasting is nathing but subClass varable is refere to the baseClass it is called as the downcasting

class Car {
	void Hundai() {
		System.out.println("Hundai i10 grand Asta model 2018");
	}
}
class Bick extends Car{
	
	void splender(Car c) {
		super.Hundai();
		Car hn = (Car)c;
		System.out.println("bick model 2011 model");
	}
	public static void main(String[] args) {
		Bick b = new Bick();
		b.splender(b);
	}
}









