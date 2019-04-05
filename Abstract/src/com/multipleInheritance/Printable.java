package com.multipleInheritance;

public interface Printable {
	void print();
}
interface showable {
	void print();
}
class TestMulInh implements Printable,showable{

	@Override
	public void print() {
System.out.println("test hello");		
	
	TestMulInh test = new TestMulInh();
	test.print();
	}
	
}