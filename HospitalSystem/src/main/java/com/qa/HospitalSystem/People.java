package com.qa.HospitalSystem;

public class People {
	
	private String ID;
	private String dateofbirth;
	private String name;
	private String sex;
	
	// since constructor will end up with lots of parameters, use a builder.
	
	public People() {
	}
	
	public People inputID(String ID) {
		this.ID=ID;
		return this;
	}
	
	public People inputDateOfBirth(String dateofbirth) {
		this.dateofbirth=dateofbirth;
		return this;
	}
	
	public People inputName(String name) {
		this.name=name;
		return this;
	}
	
	public People inputSex(String sex) {
		this.sex=sex;
		return this;
	}
	
	// getters and setters:
	
	public String getID() {
		return ID;
	}
	
	public void setID(String ID) {
		this.ID=ID;
	}
	
	public String getName() {
		return name;
	}
	

}
