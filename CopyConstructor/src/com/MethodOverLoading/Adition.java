package com.MethodOverLoading;

public class Adition {

/*	// this is the argments are changing
	static  int add(int a,int b) {
		return a+b;
		
	}
	static int add(int a, int b, int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		System.out.println(Adition.add(10, 2));
		System.out.println(Adition.add(10,2, 3));
	}*/
	
	//This is the data type are changing
	
   static int add(int a , int b) {
	   return a+b;
	   
   }
   static double add(double a, double b) {
	   return a+b;
   }
   public static void main(String[] args) {
	System.out.println(Adition.add(10, 5));
	System.out.println(Adition.add(10.d, 10.d));
}
   
   
}
