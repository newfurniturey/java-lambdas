package com.newfurniturey.lambdas.config;

import com.newfurniturey.lambdas.Gender;
import com.newfurniturey.lambdas.Person;
import java.util.ArrayList;
import java.util.List;

public class PersonConfig {
	
	public static List<Person> createList() {
		List<Person> people = new ArrayList<Person>();

		people.add(new Person.Builder()
			.surName("Baker")
			.gender(Gender.MALE)
			.age(21)
			.build() 
		);

		people.add(new Person.Builder()
			.surName("Doe")
			.gender(Gender.FEMALE)
			.age(25)
			.build() 
		);

		people.add(new Person.Builder()
			.surName("Doe")
			.gender(Gender.MALE)
			.age(25)
			.build()
		);

		people.add(new Person.Builder()
			.surName("Johnson")
			.gender(Gender.MALE)
			.age(45)
			.build()
		);

		people.add(new Person.Builder()
			.surName("Bailey")
			.gender(Gender.MALE)
			.age(67)
			.build()
		);

		people.add(new Person.Builder()
			.surName("Smith")
			.gender(Gender.MALE)
			.age(55)
			.build()
		);

		people.add(new Person.Builder()
			.surName("Jones")
			.gender(Gender.FEMALE)
			.age(85)
			.build()
		);

		return people;
	}
}
