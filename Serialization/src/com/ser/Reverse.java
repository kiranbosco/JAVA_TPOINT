package com.ser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reverse {
	public static void main(String[] args) throws ParseException {

		String name ="Rajesh Kiran";
		char ch []=name.toCharArray();
		for(int i=ch.length-1; i>=0; i--) {
			System.out.println(ch[i]);
		}

		// Convert the stirng to date formate in java

		String date ="05/01/2019";
		Date date1 = new SimpleDateFormat("dd/mm/yyyy").parse(date);
		Date dd =date1;
		System.out.println(dd);

		String upr ="krian rajesh ";
		String u =upr.toUpperCase();
		System.out.println(u);

		String rpl ="viaj y";
		String spaces =rpl.replaceAll("\\s", "");
		System.out.println(spaces);
		
		String trm = " kiran kumar  ";
		String td= trm.trim();
		System.out.println(td);
		
		String len= "i am currentyl cloudFx employee";
		int count = len.length();
			if(count%2==0) {
				System.out.println("this is the even number");
			}
			else {
				System.out.println("odd number");
			}
			System.out.println(count);
			
			// Remove particalr charactor in java string 
			
			String  rem =" indian is my country";
			
		}
	}
