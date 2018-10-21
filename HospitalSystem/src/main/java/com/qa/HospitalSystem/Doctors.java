package com.qa.HospitalSystem;

public class Doctors extends Medical {

	private int grade;
	private int team;
	private static int counterID=0;
	
	public Doctors() {
		// assign doctor ID here, using counter
		counterID++;
		setID("D"+counterID);
		//getID();
	}
	
	@Override
	public Doctors inputID(String ID) {
	return (Doctors) super.inputID(ID);
	}
	
	@Override
	public Doctors inputDateOfBirth(String dateofbirth) {
	return (Doctors) super.inputDateOfBirth(dateofbirth);
	}
	
	@Override
	public Doctors inputName(String name) {
	return (Doctors) super.inputName(name);
	}
	
	@Override
	public Doctors inputSex(String sex) {
	return (Doctors) super.inputSex(sex);
	}
	
	@Override
	public Doctors inputSalary(String salary) {
	return (Doctors) super.inputSalary(salary);
	}
	
	@Override
	public Doctors inputSpeciality(String speciality) {
	return (Doctors) super.inputSpeciality(speciality);
	}
	
	public Doctors inputGrade(int grade) {
		this.grade=grade;
		return this;
	}
	
	public Doctors inputTeam(int team) {
		this.team=team;
		return this;
	}
	
	// create constructors at the classes above for this to work.
	
	// getters and setters
	
	public int getTeam() {
		return team;
	}
	
	public void setTeam(int team) {
		this.team=team;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade=grade;
	}
	
	
}
