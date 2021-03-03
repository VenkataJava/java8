package com.ups.test.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByNameList {

	static List<User> users = Arrays.asList(
            new User("C", 30),
            new User("D", 40),
            new User("A", 10),
            new User("B", 20),
            new User("E", 50));
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<User> usersList = users.stream().sorted((o1,o2)->o1.getName().compareTo(o2.getName())).collect(Collectors.toList());
		//System.out.println(usersList);
		List<User> usersList1 = users.stream().sorted(Comparator.comparingInt(User::getAge).thenComparing(User::getName).reversed()).collect(Collectors.toList());
		System.out.println(usersList1);
	}

	static class User {

		private String name;
		private int age;

		public User(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "User{" + "name='" + name + '\'' + ", age=" + age + '}';
		}
	}

}
