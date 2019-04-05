package com.constructor;

public class ReUsingConstructor {

	int id;
	String name;
	float fees;
	String course;
	
	public ReUsingConstructor(int id, String name, float fees) {
		this.id=id;
		this.name= name;
		this.fees = fees;
		
	}
	public ReUsingConstructor(int id, String name, float fees, String course) {
		//this(id,name,fees);
		this.course=course;
		this.id = id;
		this.name = name;
		this.course = course;
		
				
		
	}
	public void disp() {
		System.out.println(id + " "+ name + " "+ fees + " "+ course );
	}
	
	class Test{
	
	}
	public static void main(String[] args) {
		ReUsingConstructor r = new  ReUsingConstructor(100, "bosco", 10.f);
		ReUsingConstructor rr = new ReUsingConstructor(99, "joseph", 11.f,"java");
		rr.disp();
		r.disp();
	}
}