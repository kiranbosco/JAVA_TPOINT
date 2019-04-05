package com.finalKey;

// DMD:-  
/*It is the mechanism which is the overridden from the base class to  derived class in java 
A super class reference variable   can refer to the sub class of object in the java
Exe of dynamic polymorphism
*/

class Student{
	void show() {
		System.out.println("This is the school student");
	}
}
class collegeStudent extends Student{
	void show() {
		super.show();
		System.out.println("Thi is the college student");
	}
	public static void main(String[] args) {
		Student stu = new collegeStudent();
		stu.show();
	}
}