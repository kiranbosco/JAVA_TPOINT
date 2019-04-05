package com.instanceOf;

public class ClassTesting  extends Testing{
	public static void main(String[] args) {
		
		ClassTesting ss = new ClassTesting();
		System.out.println(ss instanceof ClassTesting);
		
		Testing ts = new Testing();
		System.out.println(ts instanceof Testing);
	}

}
