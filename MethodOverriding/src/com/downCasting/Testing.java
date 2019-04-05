package com.downCasting;

public class Testing {
	public Testing() {
		System.out.println("Testing ");
	}
}

 class Test extends Testing{
	 public Test() {
		 System.out.println("test");
		// TODO Auto-generated constructor stub
	}
	 public static void main(String[] args) {
		Test t = new Test();
	
}
	 }