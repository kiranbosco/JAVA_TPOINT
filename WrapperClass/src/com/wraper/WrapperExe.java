package com.wraper;


// Primitive data to wrapper class 
public class WrapperExe {

public static void main(String[] args) {
	
	// int long char float double boolean  To String
	
Integer i = new Integer(10);
String str = String.valueOf(i);
System.out.println(str);

Long l = new Long(20);
String s = String.valueOf(l);
System.out.println(s);

Float f = new Float(30.0f);
String ss = String.valueOf(f);
System.out.println(ss);

Double d = new Double(40.0d);
String sss =String.valueOf(d);
System.out.println(d);

Boolean b = new Boolean("kiran");
String sb = String.valueOf(b);
System.out.println(sb);

Character ch = new Character('k');
String sh =String.valueOf(ch);
System.out.println(sh);

//  String To int long float double 
String in = new String("50");
int is =Integer.valueOf(in);
System.out.println(is);

String ff = new String("60.f");
float fs = Float.valueOf(ff);
System.out.println(fs);

String db = new String("70.d");
double ds = Double.parseDouble(db);
System.out.println(ds);

String lo = new String("80");
long lg = Long.parseLong(lo);
System.out.println(lg);

/*String chs = new String("c");
char chss = Character.valueOf(chs);

String to char cant be suport */

//===============================================

//float to double convertion

float fb = 90.f;
Double dbs =Double.valueOf(fb);
System.out.println(dbs);

float hun = 100.f;
String hm =String.valueOf(hun);
System.out.println(hm);

Double dob = 110.d;
String dobs = String.valueOf(dob);
System.out.println(dobs);



int h =250;
float fs1 =(float)h;
System.out.println(fs1);

}
}
	
	
