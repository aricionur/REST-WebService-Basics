package com.aricionur.json;

public class PersonEntity {
	
		String name;
		String surname;
		
		public PersonEntity(String name , String surname) {
			this.name = name;
			this.surname = surname;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setSurname(String surname) {
			this.surname = surname;
		}
		public String getSurname() {
			return surname;
		}
		
}
