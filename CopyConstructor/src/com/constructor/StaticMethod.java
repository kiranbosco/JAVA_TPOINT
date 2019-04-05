package com.constructor;

public class StaticMethod {

	int rollNo;
	String name;
	static String college="Narayana";

	static void change() {

		college ="narayana";
	}
	public StaticMethod(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;

	}
	public void disp() {
		System.out.println(rollNo + " "+ name + " "+ college  );
	}
	
/*	public void test() {
		System.out.println(StaticData.collegeName);
	}*/
	public static void main(String[] args) {
		StaticMethod m = new StaticMethod(101, "Joseph");
		StaticMethod m1 = new StaticMethod(102, "Bosco");
		m.disp();
		m.disp();
		m.change();
		
	}
}
