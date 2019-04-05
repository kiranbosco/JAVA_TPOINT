package com.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethods {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("kiran"); // add method()
		al.add("sujatha");
		al.add("vijay");
		al.add("charan");
		al.add("Amma");
		
		al.set(1, "srilakshmi");// set method
		
		String sss =al.get(4); // get method
		System.out.println(sss);
		
		ArrayList<String> all = new ArrayList<>();
		all.addAll(al);
		all.add("Heemaja");
		System.out.println(all);
		int s =al.size(); // size method
		System.out.println(al.isEmpty());// isEmpty method
		boolean b =al.isEmpty(); // isEmpty method
		System.out.println(b);
		boolean bs =al.contains("sujatha");// contain method

		Iterator<String> itr =al.iterator(); // iterator
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		al.remove("kiran"); // remove method
		ArrayList<String> l = new ArrayList<>();
		//al.clear();  // clear method
		boolean bb =al.containsAll(al);
		
		int j =al.hashCode();
		System.out.println(j);
		
		System.out.println(bb);
		System.out.println(bs);



//		System.out.println(al + " " + s);

	}
}
