package com.julio;

import java.util.ArrayList;
import java.util.List;

import com.julio.classes.Person;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		Person p1 = new Person ("pepe", 24);
		Person p2 = new Person ("juan", 21);
		
		List<Person> personList = new ArrayList<Person>();
		
		personList.add(p1);
		personList.add(p2);
		
		for (Person p : personList) {
			System.out.println("Name: " + p.getName());
		}
	}
}
