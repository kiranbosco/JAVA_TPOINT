package com.downcasting;

public class Upcasting {
   
	class Car {
		void cars() {
			System.out.println("cars");
		}
	}
	class Bick extends Car{
		
		void vehicle(Upcasting u) {
			Upcasting us = (Upcasting)u;
		}
	}
	public static void main(String[] args) {
		
	}
	}
