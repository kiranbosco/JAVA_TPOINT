package com.constructor;

public class CopyConstructor {
	int id;
	String name;


	public CopyConstructor(int i ,String n) {
		this.id=i;
		this.name =n;

	}
	void disp() {
		System.out.println(id + "" + name);
	}
	public CopyConstructor() {
	}
	public static void main(String[] args) {
		CopyConstructor c = new CopyConstructor(10,"micky");
		CopyConstructor cc = new CopyConstructor(20,"john");
		CopyConstructor cs = new CopyConstructor();

		CopyConstructor c1 = new CopyConstructor();
		c1.id = c.id;
		c1.name = c.name;

		cs.id = cc.id;
		cs.name= cc.name;

		c.disp();
		c.disp();
		cc.disp();		
		cc.disp();
	}
}
