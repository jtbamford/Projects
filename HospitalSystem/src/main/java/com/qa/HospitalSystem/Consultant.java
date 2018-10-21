package com.qa.HospitalSystem;

public class Consultant extends Doctors {
	
	public Consultant() {
	}
	
	@Override
	public Consultant inputID(String ID) {
	return (Consultant) super.inputID(ID);
	}
	
	@Override
	public Consultant inputDateOfBirth(String dateofbirth) {
	return (Consultant) super.inputDateOfBirth(dateofbirth);
	}
	
	@Override
	public Consultant inputName(String name) {
	return (Consultant) super.inputName(name);
	}
	
	@Override
	public Consultant inputSex(String sex) {
	return (Consultant) super.inputSex(sex);
	}
	
	@Override
	public Consultant inputSalary(String salary) {
	return (Consultant) super.inputSalary(salary);
	}
	
	@Override
	public Consultant inputSpeciality(String speciality) {
	return (Consultant) super.inputSpeciality(speciality);
	}
	
	@Override
	public Consultant inputGrade(int grade) {
	return (Consultant) super.inputGrade(grade);
	}
	
	@Override
	public Consultant inputTeam(int team) {
	return (Consultant) super.inputTeam(team);
	}

}
