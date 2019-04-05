package com.object;

import java.util.ArrayList;

public class Employee implements Cloneable {
	int id;

	String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();

	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp = new Employee(10, "kiran");

		Employee en = (Employee) emp.clone();

		Employee e = new Employee(11, "joseph");
		Employee ee = (Employee) e.clone();
		System.out.println(emp + " " + en + " " + e + " " + ee + " ");

		ArrayList<Employee> employee = new ArrayList<>();
		employee.add(ee);
		employee.add(e);
		employee.add(en);
		employee.add(emp);
		
		for(Employee list : employee) {
			System.out.println(list);
			
		}
	}
}
