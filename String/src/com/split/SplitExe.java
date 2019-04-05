package com.split;

public class SplitExe {
	public static void main(String[] args) {

		// Split method is split the object where you want split until space it object
		String ss ="Cfx-Bng Cfx-Canada Cfx-Australia Cfx-Usa";
		String [] s =ss.split(" ", 3);
		for(String us : s) {
			System.out.println(us);
		}

		/* startsWith():- this method is used either the word starts with ur given index or not it is yes it will be teturn true or it will be return false
		 * if ur missing any case also it will be throw exception supose ur object has been starts with Capital word , but ur given saml word it will be return false
		 */

		String start ="Purini kiran kumar";
		System.out.println(start.startsWith("P"));
		boolean sp =start.startsWith("P");
		System.out.println(sp);

		String sp1 ="  purini kiran kumar";
		boolean bs = sp1.startsWith("p");
		System.out.println(bs);

		/*	endWith() :- this method is similar to same but it has check the endWith letter in java object 
		 */ 
		String endE ="I am Java Developer in Cfx";
		boolean bs1 = endE.endsWith("x");
		System.out.println(bs1);

		/* substring() :- this method is part of string method we have to give object starting index and ending index number it will be return that part of name or value
		 * */

		String substr ="kirankumar";
		String sst =substr.substring(2,4);
		System.out.println(sst);

		/*toCharArray() :- this method is used for converting from string object to char array
		 */
		String conversion ="Welcome to Prini Kiran Kumar";
		char ch [] =conversion.toCharArray();
		int len =ch.length;
		System.out.println(len);
		for(int i =0; i< len; i++) {	
			System.out.println(ch[i]);

		}
		/* toLowerCase() :- this method is used for converting uper case to lower case*/
		String low ="COMPANY_ID";
		String cid =low.toLowerCase();
		System.out.println(cid);

		/* toUppercase():- this method is used for the converting lower to upper
		 */
		String uper ="tenant_id";
		String u =uper.toUpperCase();
		System.out.println(u);

		// trim() :- this method is used for removing leading and trailing spaces in string object 
		String led ="        kiran   kumar  purini";
		String ll =led.trim();
		System.out.println(ll);
		
		boolean boo =true;
		String sbs =String.valueOf(boo);
		System.out.println(sbs);
		
		
	
	}

}
