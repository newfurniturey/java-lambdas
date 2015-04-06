package com.newfurniturey.lambdas;

public class Person {
	private String surName;
	private Gender gender;
	private int age;

	public static class Builder {
		private int age = 0;
		private Gender gender = Gender.MALE;
		private String surName = "";

		public Person.Builder age(int val) {
			age = val;
			return this;
		}

		public Person.Builder gender(Gender val) {
			gender = val;
			return this;
		}

		public Person.Builder surName(String surName) {
			this.surName = surName;
			return this;
		}

		public Person build() {
			return new Person(this);
		}
	}

	private Person(Person.Builder builder) {
		surName = builder.surName;
		age = builder.age;
		gender = builder.gender;
	}

	public int getAge() {
		return age;
	}

	public Gender getGender() {
		return gender;
	}
	
	public String getSurName() {
		return surName;
	}

	@Override public String toString() {
		return String.format("Name: %s\nGender: %s\nAge: %d\n",
			surName,
			gender,
			age
		);
	}

}
