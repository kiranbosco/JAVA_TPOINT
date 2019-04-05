package com.unray;

public class CopyConstructor {

	int id;
	String name;
	
	public CopyConstructor(int i, String n) {
		id =i;
		name = n;
		
	}
	// copy constructor starts now
	public CopyConstructor(CopyConstructor s) {
	
	id =s.id;
	name =s.name;
		// TODO Auto-generated constructor stub
	}
	void disp() {
		System.out.println(id + " " + name);
	}
	public static void main(String[] args) {
		CopyConstructor cc = new CopyConstructor(111, "kiran");
		CopyConstructor cs = new CopyConstructor(cc);
		cs.disp();
		cc.disp();
		
	}

}
