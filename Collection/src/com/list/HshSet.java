package com.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HshSet {
	public static void main(String[] args) {
		/*duplicate are not allowed
		 integer cant be cast in java.lang.list
		 null value are not allowed*/

		HashSet set = new HashSet<>();
		set.add("krian"); 
		set.add("bosoc");
		//set.add(125); 
		set.add(null);
		set.add(null);// One null only accept

		set.add("125");
		String.valueOf(set);
		String str =String.valueOf(set);
		
		Iterator itr =set.iterator();
		while(itr.hasNext()) {
			String response =(String) itr.next();
			System.out.println(response);
	

		}
	}
}

