package com.constructor;

public class ThisKeyWord {
	int id;
	String name;
	int fees;
	
	public ThisKeyWord(int id, String name,int fees) {
		/*id = id;
		name =name;
		fees = fees;*/
		this.id = id;
		this.name = name;
		this.fees = fees;
		
	}
	public void disp() {
		System.out.println(id + " "+ name + " "+ fees );
	}
	public static void main(String[] args) {
		ThisKeyWord t = new ThisKeyWord(100, "bosco",100);
		t.disp();
	}

}
