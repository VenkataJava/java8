package com.ups.test.string;

import java.util.ArrayList;
import java.util.List;

public class ImmutableDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Employee e = new Employee("venkata", "gurram", new Adress("2212", "barker street", "London"));
		Adress adress = e.getAdress();
		System.out.println(adress);

		adress.setFirstLine("324B");
		adress.setSecondLine("Chandari Chawk");
		adress.setCity("Delhi");

		System.out.println(e.getAdress());
		System.out.println("------------------------------");

		List<Adress2> adressList = new ArrayList<Adress2>();
		adressList.add(new Adress2("2212", "barker street111", "London211"));
		adressList.add(new Adress2("4444", "barker street222", "London222"));
		adressList.add(new Adress2("56463", "barker street333", "London4444"));

		Employee2 e2 = new Employee2("vasu", "gurram", adressList);

		ArrayList<Adress2> adressValues = e2.getAdress();
		System.out.println(adressValues);

		adressValues.remove(0);

		System.out.println(adressValues);

	}

}
