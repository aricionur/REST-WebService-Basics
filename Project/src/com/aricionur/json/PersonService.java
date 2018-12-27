package com.aricionur.json;

import java.util.ArrayList;
import java.util.List;

public class PersonService {

	private static PersonService personService;
	List<PersonEntity> personList = new ArrayList<>();

	public static PersonService getInstance() {

		if (personService == null) {
			personService = new PersonService();
			return personService;
		}

		return personService;
	}

	public PersonService() {
		personList.add(new PersonEntity("nameofPersonOne", "surnameOfPersonOne"));
		personList.add(new PersonEntity("nameofPersonTwo", "surnameOfPersonTwo"));
	}

}
