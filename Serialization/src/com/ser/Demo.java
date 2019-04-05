package com.ser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class Demo implements Serializable {
	int id;
	String name;

	public Demo(int id, String name) {

		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) {
		Demo d = new Demo(10, "kiran");

		//serializable
		String fileStore ="file.dir";

		try {
			FileOutputStream file = new FileOutputStream(fileStore);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(d);
			out.close();
			file.close();
		}
		

		catch(Exception e) {

		}
	}
}


