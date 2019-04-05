package com.overriding;

public class Deparment {
	int deptId;
	String deptName;
	public Deparment(int deptId,String deptName) {
		this.deptId=deptId;
		this.deptName = deptName;
		
	}
}
class Employee extends Deparment{
	int empid;
	String empName;
	public Employee(int empid, String empName,int deptId,String deptName) {
		super(deptId,deptName);
		this.empid=empid;
		this.empName = empName;
	}
	public void dips() {
		System.out.println(deptId + " "+ deptName + " "+ empid + " " + empName);
	}
	public static void main(String[] args) {
		Employee ee = new Employee(10, "peter", 1023,"it");
		ee.dips();
	}
}
