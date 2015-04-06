package com.newfurniturey.lambdas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PersonTest {

	@Test
	public void buildEmpty() {
		Person person = new Person.Builder().build();
		assertNotNull(person.getAge());
		assertNotNull(person.getGender());
		assertNotNull(person.getSurName());
	}

	@Test
	public void createPerson() {
		// create an initial person to make sure the person class builds
		String firstPersonSurName = "Smith";
		Gender firstPersonGender = Gender.MALE;
		int firstPersonAge = 42;
		
		Person firstPerson = new Person.Builder()
			.surName(firstPersonSurName)
			.gender(firstPersonGender)
			.age(firstPersonAge)
			.build();
			
		assertEquals(firstPersonSurName, firstPerson.getSurName());
		assertEquals(firstPersonGender, firstPerson.getGender());
		assertEquals(firstPersonAge, firstPerson.getAge());
		
		// create a second person to make sure values aren't static
		String secondPersonSurName = "Doe";
		Gender secondPersonGender = Gender.FEMALE;
		int secondPersonAge = 29;
		
		Person secondPerson = new Person.Builder()
			.surName(secondPersonSurName)
			.gender(secondPersonGender)
			.age(secondPersonAge)
			.build();
			
		assertEquals(secondPersonSurName, secondPerson.getSurName());
		assertEquals(secondPersonGender, secondPerson.getGender());
		assertEquals(secondPersonAge, secondPerson.getAge());
		
		// re-test the first person to verify their values haven't changed
		assertEquals(firstPersonSurName, firstPerson.getSurName());
		assertEquals(firstPersonGender, firstPerson.getGender());
		assertEquals(firstPersonAge, firstPerson.getAge());
	}

}
