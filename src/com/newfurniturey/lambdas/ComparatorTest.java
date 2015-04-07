package com.newfurniturey.lambdas;

import com.newfurniturey.lambdas.config.PersonConfig;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
	
	public static void main(String[] args) {
		List<Person> personList = PersonConfig.createList();
		
		// inner class - sort ASC
		Collections.sort(personList, new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				return p1.getSurName().compareTo(p2.getSurName());
			}
		});
		
		System.out.println("=== [inner] Sorted ASC SurName ===");
		for (Person p : personList) {
			System.out.println(p.getSurName());
		}
		
		// inner class - sort DESC
		Collections.sort(personList, new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				return p2.getSurName().compareTo(p1.getSurName());
			}
		});
		
		System.out.println("=== [inner] Sorted DESC SurName ===");
		for (Person p : personList) {
			System.out.println(p.getSurName());
		}
		
		
	}
	
}
