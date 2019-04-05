package com.object;

import java.util.ArrayList;

public class Student implements Cloneable {
	int stuId;

	String name;
	String clgName;

	public Student(int stuId, String name , String clgName) {
		this.stuId=stuId;
		this.name= name;
		this.clgName=clgName;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", name=" + name + ", clgName=" + clgName + "]";
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Student student = new Student(10, "peter", "st.thomas");
		Student stu =(Student)student.clone();

		Student student1 = new Student(11,"joseph", "st.Thomas");
		Student stu1 = (Student) student1.clone();

		ArrayList<Student> studentData = new ArrayList<>();
		studentData.add(student1);
		studentData.add(student);
		studentData.add(student);
		studentData.add(stu);
		
		for(Student studentList : studentData) {
			System.out.println(studentList);
		}


	}

}
