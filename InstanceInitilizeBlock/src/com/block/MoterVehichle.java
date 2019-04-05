package com.block;

public class MoterVehichle {
	int speed;
	public MoterVehichle() {
		System.out.println("Moter vechile speed limit is 200" + " super class");
	}
} 
class Hundai extends MoterVehichle{
	public Hundai() {
		System.out.println("Hundai car speed is" +" "+  180);
	}
	{
		speed =200;
		System.out.println("Every vechicle should be maintance sppd limit" + "instance initialized block");
	}
	{
		speed =300;
		System.out.println("Hundai i10 Grand Asta car new model constance automatic complitely" + " " + 160);
	}
}
	class Motor{
		public static void main(String[] args) {
			Hundai hun = new Hundai();
			
		}
	}
