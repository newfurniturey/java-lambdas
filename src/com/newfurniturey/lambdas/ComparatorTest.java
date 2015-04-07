package com.newfurniturey.lambdas;

import com.newfurniturey.lambdas.config.PersonConfig;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
	
	public static void main(String[] args) {
		List<Person> personList = PersonConfig.createList();
		
		// inner class - sort ASC
		System.out.println("=== [inner] Sorted ASC SurName ===");
		Collections.sort(personList, new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				return p1.getSurName().compareTo(p2.getSurName());
			}
		});
		for (Person p : personList) {
			System.out.println(p.getSurName());
		}
		
		// inner class - sort DESC
		System.out.println("=== [inner] Sorted DESC SurName ===");
		Collections.sort(personList, new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				return p2.getSurName().compareTo(p1.getSurName());
			}
		});
		for (Person p : personList) {
			System.out.println(p.getSurName());
		}
		
		// lambda - sort ASC
		System.out.println("=== [lambda] Sorted ASC SurName ===");
		Collections.sort(personList, (p1, p2) -> p1.getSurName().compareTo(p2.getSurName()));
		for (Person p : personList) {
			System.out.println(p.getSurName());
		}
		
		// lambda - sort DESC
		System.out.println("=== [lambda] Sorted ASC SurName ===");
		Collections.sort(personList, (p1, p2) -> p2.getSurName().compareTo(p1.getSurName()));
		for (Person p : personList) {
			System.out.println(p.getSurName());
		}
		
	}
	
}
