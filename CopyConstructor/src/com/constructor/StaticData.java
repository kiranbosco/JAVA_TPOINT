package com.constructor;

public class StaticData {

	int id;
	String name;
	static String collegeName ="St.thomas";
	int age;
	int salary;

	StaticData(int id,String name) {
		System.out.println("this is constructor");
		this.id = id;
		this.name = name;
	}
	
	StaticData(int id,String name,int age) {
		System.out.println("this is constructor1");
		this.id = id;
		this.name = name;
		this.age=age;
	}
	
	StaticData(int id, int salary, String name) {
		System.out.println("this is constructor2");
		this.id = id;
		this.name = name;
		this.salary=salary;
	}
	void disp() {
		System.out.println(id + "  " + name + " "+ collegeName);
	}
	public static void main(String[] args) {
		StaticData data = new StaticData(10, "kiran");
		data.disp();

	}
}
