package com.qa.HospitalSystem;

public class HospitalStaff extends People {

	private String salary;
	
	public HospitalStaff() {
	}
	
	@Override
	public HospitalStaff inputID(String ID) {
	return (HospitalStaff) super.inputID(ID);
	}
	
	@Override
	public HospitalStaff inputDateOfBirth(String dateofbirth) {
	return (HospitalStaff) super.inputDateOfBirth(dateofbirth);
	}
	
	@Override
	public HospitalStaff inputName(String name) {
	return (HospitalStaff) super.inputName(name);
	}
	
	@Override
	public HospitalStaff inputSex(String sex) {
	return (HospitalStaff) super.inputSex(sex);
	}
	
	public HospitalStaff inputSalary(String salary) {
		this.salary=salary;
		return this;
	}
	
}
