package com.qa.HospitalSystem;

public class JuniorDoctor extends Doctors {
	
	public JuniorDoctor() {
	}
	
	@Override
	public JuniorDoctor inputID(String ID) {
	return (JuniorDoctor) super.inputID(ID);
	}
	
	@Override
	public JuniorDoctor inputDateOfBirth(String dateofbirth) {
	return (JuniorDoctor) super.inputDateOfBirth(dateofbirth);
	}
	
	@Override
	public JuniorDoctor inputName(String name) {
	return (JuniorDoctor) super.inputName(name);
	}
	
	@Override
	public JuniorDoctor inputSex(String sex) {
	return (JuniorDoctor) super.inputSex(sex);
	}
	
	@Override
	public JuniorDoctor inputSalary(String salary) {
	return (JuniorDoctor) super.inputSalary(salary);
	}
	
	@Override
	public JuniorDoctor inputSpeciality(String speciality) {
	return (JuniorDoctor) super.inputSpeciality(speciality);
	}
	
	@Override
	public JuniorDoctor inputGrade(int grade) {
	return (JuniorDoctor) super.inputGrade(grade);
	}
	
	@Override
	public JuniorDoctor inputTeam(int team) {
	return (JuniorDoctor) super.inputTeam(team);
	}
	
	
}
