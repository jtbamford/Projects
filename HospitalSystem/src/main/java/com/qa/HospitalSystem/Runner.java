package com.qa.HospitalSystem;

public class Runner {
	
	public static void main(String args[]) {
		
		Consultant D1 = new Consultant().inputName("Tim").inputTeam(0);
		JuniorDoctor D2 = new JuniorDoctor().inputName("Alex").inputTeam(0);
		JuniorDoctor MH = new JuniorDoctor().inputTeam(3)
				.inputGrade(2);
		
		System.out.println(MH.getID());
		System.out.println(D2.getGrade());
		System.out.println(MH.getGrade());
		System.out.println(MH.getName());
		System.out.println(D2.getName());
		
		
	} 
	
}
