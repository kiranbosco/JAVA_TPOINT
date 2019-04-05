package com.abstracts;

 abstract class Shape {
	abstract void draw();
		
}
 class Rectangle extends Shape{

	@Override
	void draw() {
		System.out.println("drawing rectangle");
		
	}
	 
 }
 class Circle extends Shape{
	 
	@Override
	void draw() {
	
		System.out.println("drawing circle");
		
	}
 }
	 class Demo{
		 public static void main(String[] args) {
		/*	Shape sh = new Circle();
			sh.draw();*/
			
			 Shape s;
			 s = new Circle();
			 s.draw();
			 s=new Rectangle();
			 s.draw();
			 
		}
		 
	 }
 
