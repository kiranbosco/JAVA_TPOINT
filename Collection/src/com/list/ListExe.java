package com.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("unused")
public class ListExe {
	
	int id;
	String name;
	String author;
	String publisher;
	
	public ListExe(int id,String name, String autor, String publisher) {
	
		this.id =id;
		this.name=name;
		this.author=autor;
		this.publisher=publisher;
		
	}
	@Override
	public String toString() {
		return "ListExe [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + "]";
	}
	public static void main(String[] args) {
		
		ListExe ll = new ListExe(10, "bosco", "Joseph", "peter");
		ListExe l2 = new ListExe(11, "irfan", "john", "peter");


		ArrayList<ListExe> list = new  ArrayList<>();
		list.add(ll);
		list.add(l2);
		for(ListExe exe : list) {
			System.out.println();
		}
		
		
		}
		
	}

