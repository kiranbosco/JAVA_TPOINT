package com.abstracts;
/*
abstract class Bike{
	   Bike(){
	System.out.println("bike is created");
	}
	   abstract void run();
	   void changeGear(){
	System.out.println("gear changed");
	}
	 }

	 class Honda extends Bike{
	 void run(){
	System.out.println("running safely..");
	}
	 }
	 class TestAbstraction2{
	 public static void main(String args[]){
	  Bike obj = new Honda();
	  obj.run();
	  obj.changeGear();
	 }
	}
 */



abstract class Bick {
	public Bick() {
		System.out.println("bick created");
	}
	abstract void run();
	void changeGare() {
		System.out.println("change the gare");
		
	}
}
class Honda extends Bick{

	@Override
	void run() {
System.out.println("created has been successfully done");		
	}
}
class AbstractDemo{
	public static void main(String[] args) {
	/*	Bick b = new Honda();
		b.changeGare();
		b.run();*/
		
		Bick b;
		b = new Honda();
		b.changeGare();
		b.run();
		
	}
}