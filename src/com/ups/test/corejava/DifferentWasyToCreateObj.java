package com.ups.test.corejava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

public class DifferentWasyToCreateObj implements Cloneable, Serializable {

	public DifferentWasyToCreateObj() {
		System.out.println("Hello! DifferentWasyToCreateObj() just got created..");
	}

	protected Object clone() throws CloneNotSupportedException {
		return (DifferentWasyToCreateObj) super.clone();
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		DifferentWasyToCreateObj object1 = new DifferentWasyToCreateObj();

		DifferentWasyToCreateObj object2 = (DifferentWasyToCreateObj) Class
				.forName("com.ups.test.corejava.DifferentWasyToCreateObj").newInstance();

		DifferentWasyToCreateObj secondObj = new DifferentWasyToCreateObj();
		DifferentWasyToCreateObj object3 = (DifferentWasyToCreateObj) secondObj.clone();

		Object object4 = DifferentWasyToCreateObj.class.getClassLoader()
				.loadClass("com.ups.test.corejava.DifferentWasyToCreateObj").newInstance();

		// Create Object5: Create a new file with an ObjectOutputStream
		FileOutputStream out = new FileOutputStream("DifferentWasyToCreateObj.txt");
		ObjectOutputStream oout = new ObjectOutputStream(out);
		oout.writeObject(object4); // write object4 to file
		oout.flush();

		// create an ObjectInputStream for the file we created before
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("C:\\Users\\venkataGurram\\Desktop\\temp\\crunchify.txt"));
		DifferentWasyToCreateObj object5 = (DifferentWasyToCreateObj) ois.readObject();

		// Create Object6: use the Constructor class from the java.lang.reflect
		Class clazz = DifferentWasyToCreateObj.class;
		Constructor crunchifyCon = clazz.getDeclaredConstructors()[0];
		DifferentWasyToCreateObj obj = (DifferentWasyToCreateObj) crunchifyCon.newInstance();

	}
}