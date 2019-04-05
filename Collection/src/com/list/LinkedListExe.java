package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExe {
	public static void main(String[] args) {
		 /*order is not preserved 
		because it is not imlplimented randam access interface 
		it is best sutable insertion and delete operation in middle of the 
		operation
		*/
		
		LinkedList<String> link = new LinkedList<>();
		link.add("peter");
		link.add("joseph");
		link.add("john");
		link.add("bosco");
		link.add("stella");
		link.add("Heemaja");
	//	link.removeLast();
	//	link.removeFirst();
	//	link.getFirst();
		boolean b =link.contains("kiran");
		System.out.println(b);
		link.set(1, "ashok");
		link.getLast();
		
		Iterator<String> itr =link.iterator();
		while(itr.hasNext()) {
			String listIterator =itr.next();
			System.out.println(listIterator);
		}
		
		LinkedList<String> list =new LinkedList<>();
		list =(LinkedList<String>) link.clone();
		System.out.println(list);

		LinkedList<String> array = new LinkedList<>();
		array = list;
		for(int i =0; i< array.size();i++) {
			System.out.println(array.get(i));
		}
		
	}

}
