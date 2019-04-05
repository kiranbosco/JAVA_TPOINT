package com.dataTypes;

import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.ShortHolder;

public class DataTypeDeclaration {
	
public static void main(String[] args) {
	
	// Data Type declaration
	/*int a =10;
	int b =20;
	int c =(int)(a+b);
	System.out.println(c);
	
	// Unary operator declarationn 
	
	int x =10;
	
	System.out.println(x++);
	System.out.println(++x);*/
	
/*	
	
	int a =10;
	int b =10;
	System.out.println(a++ + ++a);
	System.out.println(b++ + b++);
	*/
	
/*	int a =10;
	int b =20;
	boolean c = true;
	boolean d = false;
	System.out.println(~a);
	System.out.println(!c);
	*/
	/*
	int a=10;
	int b =5;
	int c=20;
	System.out.println(a<c);*/

/*
	int a=10;
	int b =5;
	int c=20;
	System.out.println(a<b&&a++<c);
*/
/*	
	int a =10;
	int b =5;
	int c =20;
	System.out.println(a<b||a<c);
	*/
	
/*	int boys =18;
	int girls =40;
	if(boys > 16 || girls<60) {
		
		System.out.println("You Can Enter");
	}
	else {
		System.out.println("U cant Enter");
	}*/
	
/*	int x =10;
	if(10<20) {
		System.out.println("ture");
	}
	else {
		System.out.println("false");
	}*/
	
	// Ternary operator
/*	int x =(10<20) ? 30:40;
	System.out.println(x);*/
	
	
	/*
	 String x = "Sher"; 
     String y = "Locked"; 
     if(x.equals("Sher")&&y.equals("Locked") || x.equals("kiran")&& y.equals("Rajesh")) {
    	 System.out.println("Login successflly");
     }
     else {
    	 System.out.println("Rong credintional");
     }
*/
	
	// Asignment operators in java
	
	/*int a =10;
	int b= 20;
	a+=4;
	b-=6;
	System.out.println(a);
	System.out.println(b);*/
	
/*	int number =11;
	if(number%2==00) {
		System.out.println("the value is Even num");
	}
	else {
		System.out.println("the value is odd num");
	}
*/


	// Else if statement
	
	/* int age=20;  
	    int weight=80;    
	    //applying condition on age and weight  
	    if(age>=18){    
	        if(weight>50){  
	            System.out.println("You are eligible to donate blood");  
	        }    
	    }    */
	
	
	
/*	int age=20;
	int weight =80;
	if(age<18 && weight<50) {
		System.out.println("you are eligible for the voting");
	}
	else {
		System.out.println("sorry");
	}*/
	
	
/*	// SwitchStatement code
	
	int number =20;
	
	switch(number) {
	case 10:
		System.out.println(" 10");
		break;
	case 20:
		System.out.println("20");
	break;
	case 30:
		System.out.println("30");
	}

	
	*/

/*	
	
	int month =1;
	String monthString="";
	
	switch(month) {
	case 1: monthString="jan";
	break;
	case 2 :monthString="feb";
	break;
	case 3: monthString="march";
	break;
	case 4: monthString="appril";
	break;
	case 5: monthString="may";
	break;
	case 6: monthString="jun";
	break;
	case 7: monthString="july";
	break;
	case 8: monthString="august";
	break;
	case 9: monthString="sectember";
	break;
	case 10:monthString="october";
	break;
	case 11: monthString="november";
	break;
	case 12: monthString="december";
	
	break;
	default : System.out.println("invalid month");
	}
	System.out.println(monthString);
	
	*/
	
	// Java Nested Switch Statement
	
/*	char branch='c';
	int collegeYear=4;
	switch (collegeYear) {
	case 1: 
		System.out.println("Eng Math Java mysql");
		break;
	case 2 :
switch(branch)	{
case 'c':
	System.out.println("Operating System, Java, Data Structure");
		break;
case 'E' :
	System.out.println("Micro processors, Logic switching theory");
	break;
	}
	case 3 :
		switch (branch) {
		case 'c':
			System.out.println("c c++ datastructor mysql oracle mdm");
			
			break;

		default:
			break;
		}
	default:
	}

	
	*/
	
	
	//For loop  Enhenced for loop
	
/*	List<String> somelist = new ArrayList<>();
	somelist.add("kiran");
	somelist.add("vijay");
	somelist.add("sujatha");
	somelist.add("charan");
	
	for(String item : somelist) {
		System.out.println(item);
	}*/
	
	/*for(int i=0;i<somelist.size();i++) {
			System.out.println(somelist);
*/
	
	// ======JAVA BREAK STATEMENT USING FOR LOOP WHILE LOOP AND DO WHILE LOOP=====
	

	/*for(int i=1;i<=5;i++) {
		if(i==4) {
			break;
	}
		System.out.println(i);

	}
	*/
	/*
	// java labeled for loop
	aa:  
        for(int i=1;i<=3;i++){  
            bb:  
                for(int j=1;j<=3;j++){  
                    if(i==2&&j==2){  
                        break aa;  
                    }  
                    System.out.println(i+" "+j);  
                }  
        }  */
	
	// Continue statement in java it can be use in java when u ur loop is shadanly stop you want to continue the flow u can use the continue statement in java
/*	
	for(int i=0; i<=10;i++) {
		if(i==5) {
			continue;
		}
		System.out.println(i);
	}*/
	
	//TypeCasting in java



	/*
	if(age<=18 && weight<=50)
		
		i(age>18 || weight<=50)
*/
	
	
}
}
	
 
