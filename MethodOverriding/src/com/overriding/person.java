package com.overriding;

// super keywor usihg realtime in baseclass and sub class
 class person {
	int id;
	String name;
	public person(int id, String name) {
		this.id=id;
		this.name=name;	
	}
	}
 class Emp extends person{
	float salary;
	public Emp(int id, String name,float salary) {
		super(id,name);
		this.salary=salary;
	}
	void disp(){
	System.out.println(id + " "+ name + " " + salary);
	}
	public static void main(String[] args) {
		Emp e = new Emp(10, "bosoc", 1000.f);
		e.disp();
	}
}
 




