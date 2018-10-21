package com.qa.HospitalSystem;

public class Medical extends HospitalStaff {

	private String speciality;
	
	public Medical() {
	}
	
	@Override
	public Medical inputID(String ID) {
	return (Medical) super.inputID(ID);
	}
	
	@Override
	public Medical inputDateOfBirth(String dateofbirth) {
	return (Medical) super.inputDateOfBirth(dateofbirth);
	}
	
	@Override
	public Medical inputName(String name) {
	return (Medical) super.inputName(name);
	}
	
	@Override
	public Medical inputSex(String sex) {
	return (Medical) super.inputSex(sex);
	}
	
	@Override
	public Medical inputSalary(String salary) {
	return (Medical) super.inputSalary(salary);
	}
	
	public Medical inputSpeciality(String speciality) {
		this.speciality=speciality;
		return this;
	}
	
}
