package com.math;

public class JavaMathExample {
	public static void main(String[] args) {
		double x=10;
		double y =20;
		
		System.out.println("the math size"+Math.max(x, y));
		System.out.println("the math min size"+ Math.min(x, y));
		System.out.println(" the math logn" + Math.log(x));
		System.out.println(Math.log(y));
		System.out.println(Math.log10(x));
		//====================================
		
		System.out.println(Math.abs(x));
		System.out.println(Math.abs(y));
		System.out.println(Math.round(y));
		System.out.println(Math.sqrt(y));
		
		int num1=10;
		char name='a';
		Integer intName=Integer.valueOf(name);
		System.out.println(intName);
		Integer num2=new Integer(10);
		System.out.println(num1==num2);
		System.out.println(num2.equals(num1));
		
		Integer i1=new Integer(100);
		Integer i2=new Integer(100);
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		
		Integer i3=new Integer(1000);
		Integer i4=new Integer(1000);
		System.out.println(i3==i4);
		System.out.println(i3.equals(i4));
		
		Integer i5=128;
		Integer i6=128;
		System.out.println(i5==i6); //fasle
		System.out.println(i5.equals(i6)); //true
		
		
		
		

	}

}
