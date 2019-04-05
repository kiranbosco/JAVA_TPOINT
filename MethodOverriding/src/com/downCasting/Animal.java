package com.downCasting;

  class A extends B{	A(){
		
		System.out.println("in compiler");
	}
	{
		System.out.println("in RRB");
		
	}
	static
	{
		System.out.println("in static");
	}
	public static void main(String[] args) {
		A a = new A();
//		B b = new B();
		
	}
}

class B{
	

	B(){
		System.out.println("in compiler C");
	}
	{
		System.out.println("in RRB C");
		
	}	
	
	static
	{
		System.out.println("in static C");
	}
}


