package com.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionExamples {
	public static void main(String[] args) {

		//List is order preserved, it allows duplicate, null
		//List has ArrayList, LinkedList,Vector and Stack
		//List allows duplicate
		//List allows null values (more than once)
		// vector and stack are legacy collections (1.0) and these are
		// synchronized.

		//Array List Example
		//Array List is used for Iteration, 
		// because iteration in arraylist is faster than linked list
		//because it is implemented RandomAccess Interface
		// We can perform add,remove,delete operations also but LinkedList is 
		//better than arrayList to perform operations.

		// add element
		ArrayList<String> al=new ArrayList<String>();
		al.add("kiran");
		al.add("rajesh");
		al.add("sindhu");
		al.add("suddin");
		al.add("ganesh");
		System.out.println(al);

	/*	 remove element
			al.remove("kiran");
		al.removeAll(al);*/

// arraylist doesnot suport the descending method



		// Linked List Example
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("rajesh");
		ll.add("keeriti");
		ll.add("kiran");
		ll.add("sindhu");
		ll.add("kiran");
		Iterator<String> itr =ll.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	//	System.out.println(ll);

		Vector<String> v=new Vector<String>();
		v.add("rajesh");
		v.add("kiran");
		v.add("rajesh");
		v.add("suddin");
		System.out.println(v);

		Stack<String> s=new Stack<String>();
		s.add("rajesh");
		s.add("kiran");
		s.add("rajesh");
		s.add("suddin");
		System.out.println(s);


		/*--- SET ---*/
		// Set dont allows duplicate values
		// It alows only one null values
		// It has hashSet, LinnkedHashSet, BinarySet, TreeSet
		// Interview Question: Explain internal implementaion of Set

		HashSet<String> hs=new HashSet<String>();
		hs.add("rajesh");
		hs.add("keeriti");
		hs.add("kiran");
		hs.add("sindhu");
		hs.add("");
		hs.add("");
		hs.add(null);
		//hs.add(" ");
		hs.add("kiran");
		System.out.println(hs);

		//Maintains Order
		// Used to perform operations 
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("rajesh");
		lhs.add("keeriti");
		lhs.add("kiran");
		lhs.add("sindhu");
		lhs.add("");
		lhs.add("");
		lhs.add(null);
		//hs.add(" ");
		lhs.add("kiran");
		System.out.println(lhs);

		//(either ascending/descending)
		// it takes only homogenous values
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("rajesh");
		ts.add("keeriti");
		ts.add("kiran");
		ts.add("sindhu");
		ts.add("");
		ts.add("");
		//ts.add(null);
		//hs.add(" ");
		ts.add("kiran");
		System.out.println(ts);

		/*-- Map --*/
		//HashMap, HashTable, TreeMap, LinkedHashMap,Multivalue hashmap
		//it is in key and value pair
		// key should be unique
		//it allows one null key and multiple nullvalues

		HashMap<String,String> hm=new HashMap();

		hm.put("1", "rajesh");
		hm.put("2","Kiran");
		hm.put("3","sindhu");
		hm.put("4", "kireeti");
		hm.put("","xyz");
		hm.put("","abc");
		hm.put("10","");
		hm.put("20","");
		hm.put(null, "pqr");
		hm.put("1", "kumar");
		System.out.println(hm);

		// it wont allow a single null key
		// it is synchronized
		// it is a legacy class
		Hashtable<String,String> ht=new Hashtable();		
		ht.put("1", "rajesh");
		ht.put("2","Kiran");
		ht.put("3","sindhu");
		ht.put("4", "kireeti");
		ht.put("","xyz");
		ht.put("","abc");
		ht.put("10","");
		ht.put("20","");
		//ht.put(null, "pqr");
		ht.put("1", "kumar");
		System.out.println(ht);

		Student s1=new Student(1,"rajesh");
		Student s2=new Student(2,"kiran");
		Student s3=new Student(1,"rajesh");
		Student s4 = new Student(2, "kiran");
		HashSet<Student> hs1=new HashSet<Student>();
		hs1.add(s1);
		hs1.add(s2);
		hs1.add(s3);
		hs1.add(s4);
		System.out.println(hs1.toString());
		Iterator itr1=hs1.iterator();
		while(itr1.hasNext())

		{
			System.out.println(itr1.next().toString());
		}

		// map key should be unique 
		// allow one null value
		// it is allow one empty value




		Map<String ,Student>map = new HashMap<>();
		map.put("1", s1);
		map.put("1", s2);
		map.put("3", s3);
		map.put("null", s4);
		map.put("null", s2);
		map.put("", s4);
		map.put("", s2);

		for(Map.Entry<String, Student> entry : map.entrySet()) {
			String key =entry.getKey();
			Student val = entry.getValue();


		}

	}
}

class Student
{
	int rollNo;
	String name;

	Student(int rollNo, String name)
	{
		this.rollNo=rollNo;
		this.name=name;		
	}
	@Override
	public String toString()
	{
		return "Student Roll No is "+rollNo +" Student Name is "+name;
	}
}
