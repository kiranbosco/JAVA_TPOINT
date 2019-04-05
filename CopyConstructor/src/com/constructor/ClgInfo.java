package com.constructor;

public class ClgInfo {

	public static void main(String[] args)
	{
		System.out.println(StaticData.collegeName);
		ClgInfo ci=new ClgInfo();
		ci.test();
		StaticData sd=new StaticData(100,200,"abc");
		sd.disp();
		
		//System.out.println();
	}
	
	public void test()
	{
		System.out.println(StaticData.collegeName);
	}
}

