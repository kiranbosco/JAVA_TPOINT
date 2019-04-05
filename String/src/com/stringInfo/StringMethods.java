package com.stringInfo;

import java.io.CharArrayReader;
import java.util.Iterator;
import java.util.ListIterator;

public class StringMethods {
	public static void main(String[] args) {

		// how many ways to create the java object in string

		//	we can create the java string object 2 ways by using literal and by using new keyword

		/*		NOte:-
		 * when your create the java literal object it will be storing,  string constant pool that reference is storing in stack area
		 *  if your create  the same object with different reference the object will not be create it will be checking wethe
		 *   wether the same object is existed or not in the constant pool if it is there object will not be create same object 
		 *   but reference will be store the stack area
		 */		
		String s ="Java";
		String s1 ="Java";

		String ss = new String("Java");
		System.out.println(s.equals(ss)); // This eqals method will be checkig the Object content it will be checking constant pool wether the same object is existed or not it is existed it will be "true" or it is not it will be "false"
		System.out.println(s == ss); // this eqal operator will be checking stack reference both are different it will be false


		//JAVA STRING EXAMPLES

		String java="kiran";
		char  ch [] = {'j','a','v','a'};
		String sj =new String("purini");

		System.out.println(java);
		System.out.println(ch);
		System.out.println(sj);

		/*
		 *     charAt   this metho will be retrun char valus at the given number the  number starts from 0 to n-1, where n is given length of given number 
		 *     N is length of string it will be given IndexOutOfBoundException 
		 * */
		/*	public char charAt(int index) {  
		       if ((index < 0) || (index >= value.length)) {  
		           throw new StringIndexOutOfBoundsException(index);  
		       }  
		       return value[index];  
		   }  

		}*/


		// This method is using finding specific charactor in string method()		
		String name ="Charan";
		char chs =name.charAt(2);
		System.out.println(chs);


		// Note :-  when ur getting the stringIndexOutOfBounds Exception in java string when ur crossing the length of ur string 

		String names ="Srilakshmi";
		char c =names.charAt(5);
		System.out.println(c);


		//  finding the java object length of object 
		String strs ="purini kiran kumar";
		int x =strs.length();
		System.out.println(x);



		// How many odd number in this string literal object 
		String str ="sujatha";
		for(int i=0; i<str.length()-1;i++) {
			if(i%2!=0) {
				System.out.println("kiran" + i + " " + "Vijay");

			}
		}
		// How many even number in this string literal object

		String jmj = "Purini Ramanaiah";
		for(int i=0; i<str.length()-1; i++) {
			if(i%2==0) {
				System.out.println("Seshamma " + i + " Vijay");
			}



			// how many odd number in this string object

			String oddNum ="JavaDeveloper";
			for(int j=0;i<oddNum.length()-1;j++) {
				if(i%2!=0) {
					System.out.println(" kiran " + i + "vijay");
				}
			}



			/* compareTo method()
			 * This method is used for comparing two stirng object if first stirng is compare to secound string  it will be return positive or negitive or zero 
			 * it will be compare the base unicode to string chatactor
			 * if "First string is greater  then secound string it will be return positive or  if first Stirng is less then secound string it will be return negitive
			 * or zero
			 * 
			 *   if(s1> s2) // it will be return positive
			 *   if(s2 < s2) it will be return negitive
			 *  if(s1==s2) it will be return zero
			 * 
			 */	
			String s4 ="Hello";
			String s5 ="Hello";
			String s6 ="meklo";
			String s7="heklo";
			String s8 ="flag";
			System.out.println(s4.compareTo(s5));
			System.out.println(s4.compareTo(s7));
			System.out.println(s4.compareTo(s8));

			//  CompareTo Empty String 

			String  pk ="Hello";
			String ps ="";
			String pg ="me";
			System.out.println(pk.compareTo(ps));
			System.out.println(ps.compareTo(pg));
			/*
			 * String concat :-
			 * this method will be using appending one string to another stirng 
			 * */


			String con ="Java String";
			con =con.concat(" mmutable ");
			con =con.concat( "method ");
			System.out.println(con);


			String cons ="Hello ";
			String co =" Java";

			String str1 =cons.concat(cons);
			System.out.println(str1);

			/*
			 * Stirng contains()
			 * This method is used for searching sequence of charactor in java stirng if it is found it will return true or it will be return fase 
			 * */
			// this method is used for the serarching sequence of charactor in java 
			String cnx ="Do you know what the special today";
			System.out.println(cnx.contains("Do you know"));
			System.out.println(cnx.contains("special"));
			System.out.println(cnx.contains("what"));
			System.out.println(cnx.contains("kiran"));
			System.out.println(cnx);

			// endWith method in java string it will be checking wether the given index is sufficient in end or not if it is there in last index it will be return true or else it will be false
			String end ="purinikiran";
			System.out.println(end.endsWith("n"));
			System.out.println(end.endsWith("kiran"));


			String str2 ="JavaTpoint";
			if(str2.endsWith("x")) {
				System.out.println("it is there");
			}
			else {
				System.out.println("sorry");
			}


			/*	
			 * 	eqals Method in java : -   this method is used for the checking the content wether the object ore same or not if it is same it will be return true or it will be return false in java
			 * stirng
			 * 
			 * Dif :-  difference between eqals method and eqals operator in java
			 *   eqals method is checking the content of java object
			 *   eqals Operator it will be checking the reference of java object
			 */		

			String eql ="Java tutorial point"	;
			String eq ="Java tutorial point";

			String eqs = new String("Java tutorial point");
			System.out.println(eqs == eql); // thi will be checking the reference of in java
			System.out.println(eql.equals(eq)); // this will be checking the content of object in java


			String eql1 ="Java tpoint";
			String eqs2 = "Java tpoint";
			String es1 = new String("Java tpoint");

			if(eql1.equals(eqs2)) {
				System.out.println("it is there");
			}
			else {
				System.out.println("sorry");
			}

			if(eql.equals(es1)) {
				System.out.println("i am here");
			}
			else {
				System.out.println("i am not here");
			}

			if(eql.equalsIgnoreCase(es1)) {
				System.out.println("i am eqals ignore case");
			}
			else {

			}

			/*
			 * Eqals Ignore case :-  this method is irrespect of Case of string object 
			 * EXE:- String s ="kiran";
			 *       String ss ="KIRAN";  both ore valid it will be return true
			 * */

			String sh ="krian";
			String sg =new String("KIRAN");
			if(sh.equals(sh)) {
				System.out.println("both ore same");
			}
			else {
				System.out.println("it will be dif Cases");
			}

			/*		
			 * String.Formate : -    This method is use for the set the specific tyep of formate in java stirng if ur not set the any type 
			 * it willl be taken LocalDefault formate in java 
			 */	
			String names1 ="kiran";
			String sn =String.format("%s", names1);
			System.out.println(sn);


			/*getChar method :- this metod is use for copy of specific index starting and index end inside charactor will be retrive
			 * 
			 * */
			String name3  ="My name is kiran kumar purini";
			char chss [] = new char [50];
			name3.getChars(10, 18, ch, 0);
			System.out.println(chss);
			//	name3.getChars(srcBegin, srcEnd, dst, dstBegin);

			/* indexOf this method is used for the return the specific index value 
			 * exe:- if ur given indedOf valueOf(10) this is return value of 10 charactor
			 * */
			String ind ="JavaTurorialPoint";
			int inx =ind.indexOf("T");
			System.out.println(inx);



			/* Intern method() :- this method is return conical reprasentation of string if two method are created same object
			 * like this :- Stirng str ="kiran";
			 *              String str1= new String("kiran");
			 *              it is both object are same but reference are different 
			 *              when ur using new keyword it will be create the new object in heap memory 
			 *              when ur using string literal  will be storing "scp" string constant pool are
			 *              but reference are storing in stack area
			 * */
			String sjs=new String("hello");  
			String s2="hello";  
			String s3=s1.intern();//returns string from pool, now it will be same as s2  
			System.out.println(sjs==s2);//false because reference variables are pointing to different instance  
			System.out.println(s2==s3);//true because reference variables are pointing to same instance  


			/*   isEmpty ():- this method is used for checking wether the object is empty or not
			 *  if it is empty it will be return true or it it is not true it will be false
			 * */
			String strk ="";
			String stra ="kiran";
			System.out.println(strk.isEmpty());
			System.out.println(stra.isEmpty());

			String strv ="";
			String stru ="java";
			if(strv.isEmpty()) {
				System.out.println("object is empty");
			}
			else {
				System.out.println("object has consist some value");
			}

			String strx ="java";
			if(strx.length()==0 || strx.isEmpty()) {
				System.out.println("the object is empty");
			}
			else {
				System.out.println("the object has been consist some value");
			}


			/* join() :-  this method is used for joining the java object it is like concatnate method();
			 * there are two type of joins in java stirng object
			 * 
			 * */

			String str9 =String.join("@", "kiran","gmail.com");
			System.out.println(str9);
			String str10 =String.join("@", "charan","purinis.com");
			System.out.println(str10);

			String date =String.join("/", "17","12","2018");
			System.out.println(date);
			String time =String.join(":", "16" ,"20");
			System.out.println(time);

			/*lastIndexOf :-  this method is used for checking the lastIndex value
			 * */
			String strl ="kiran";
			int ij =str.lastIndexOf("r");
			System.out.println(ij);


			/* length :- this method is used for the counting length of string object
			 * */
			String val ="kiran";
			if(val.length()>0) {
				System.out.println("string is not empty "+ val.length());
			}
			if(val.length()==0) {
				System.out.println(val);
			}

			/*  replace :- this method is used for the replace the old value to new value
			 * */

			String vals ="kirang";
			String rep =vals.replace("g", "P");
			System.out.println(rep);


			String val1 ="My name is kiran kumar ";
			String reps =val1.replace("kumar", "Bosco");
			System.out.println(reps);

			/* split():- this method is used for split the value
			 */
			String spl ="JavaTpoint offers Online Training and Winter Training on Java, Blockchain, Machine Learning, Meanstack, Artifical Intelligence, Kotlin, Cloud Computing, Angular, React, IOT, DevOps, RPA, Virtual Realty, Embedded Systems, Robotics, PHP, .Net, Big Data and Hadoop, Spark, Data Analytics, R Programming, SAP, Android, Python, Oracle, Web Designing, Spring, Hibernate, Software Testing, Seleninum, Linux, C++ and many more technologies\r\n" + 
					"";
			String repg =spl.replace(" ", "-"); // do with using join method
			System.out.println(repg);

			String sgs ="JavaTpoint offers Online Training and Winter Training on Java, Blockchain, Machine Learning, Meanstack, Artifical Intelligence, Kotlin, Cloud Computing, Angular, React, IOT, DevOps, RPA, Virtual Realty, Embedded Systems, Robotics, PHP, .Net, Big Data and Hadoop, Spark, Data Analytics, R Programming, SAP, Android, Python, Oracle, Web Designing, Spring, Hibernate, Software Testing, Seleninum, Linux, C++ and many more technologies\r\n" + 		"";
			String jsc =String.join(" ", "-");
			System.out.println(jsc);

			String  chs1  ="kiran,rajesh,sindhu kireeti";
			String repk = chs1.replace(",", "-");
			String chss1[] =rep.split("-");
			for(String ssk : chss1) {
				System.out.println(ssk);
			}

			String nameList="rajesh,kiran,keeriti,sindhu,ganesh,suddin";
			String[] nameArray=nameList.split(",");
			System.out.println(nameArray);
			for(String name1:nameArray)
			{
				System.out.println("My Name is : "+name1);
			}
			String nameWithSplCharacters=String.join("-", nameArray);
			System.out.println(nameWithSplCharacters);

			String[] dates= {"17","11","1989"};
			String dobFormat=String.join(" ", dates);
			System.out.println(dobFormat);
		}
			
		
		}
}
	
