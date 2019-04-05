package com.overriding;

public class Vehicle {
	public void show() {
		System.out.println("vehicle is running()");
	}
}
class BigVechile extends Vehicle{
	public void show() {
		super.show();
		System.out.println("Big vehicle is running()");
	}
	public void show1() {
		System.out.println("sub vehicle is running()");
	}
	public void show2() {
		System.out.println("sub vehicle 1 is running");
	}
}

class LorgeVehicle{
	public void show() {
		System.out.println("Lorge vehicle is running()");
	}
}
class Demo{
	public static void main(String[] args) {
		LorgeVehicle l = new LorgeVehicle();
		l.show();

		BigVechile b = new BigVechile();
		b.show();
		b.show1();
		b.show2();
	}
}