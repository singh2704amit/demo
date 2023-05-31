package com.example.entity;

import java.util.Date;



//@Entity
//@Table(name = "person")
public class PersonEntity {

	//@Id
	//@GeneratedValue
	//@Column(name = "id")
	private int id;

	//@Column(name = "name")
	private String name;

	//@Column(name = "location")
	private String location;

	//@Column(name = "birth_date")
	private Date birthDate;

	public PersonEntity() {
		super();

	}

	public PersonEntity(String name, String location, Date birthDate) {
		super();
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}

	public PersonEntity(int id, String name, String location, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "PersonEntity [id=" + id + ", name=" + name + ", location=" + location + ", birthDate=" + birthDate
				+ "]";
	}

}
