package com.qa.HospitalSystem;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HospitalTest {
	
	Consultant D1;
	JuniorDoctor D2;
	JuniorDoctor D3;
	JuniorDoctor D4;
	
	int posttestteam1,posttestteam2;
	
	@Before public void setup() {
	D1 = new Consultant().inputName("Stephen May").inputTeam(0);
	D2 = new JuniorDoctor().inputName("Brian Cook").inputTeam(0);
	D3 = new JuniorDoctor().inputName("Steph May").inputTeam(0);
	D4 = new JuniorDoctor().inputName("Brian Ball").inputTeam(0);
	}
	
	@After public void tearDown() {
	}
	
	@Test
	public void createDoctorTeamTest() {
		assertEquals("Team 1: Stephen May and Brian Cook",
				TeamManagement.createDoctorTeam(D1,D2));
	}
	
	@Test
	public void createDoctorTeamTest2() {
		D1.setTeam(1);
		D2.setTeam(1); // set teams made earlier (they are overwritten by before statements)
		assertEquals("Team 1: Brian Cook and Stephen May",
				TeamManagement.createDoctorTeam(D2,D1));
	}
	
	@Test
	public void createDoctorTeamTest3() {
		assertEquals("Team 2: Brian Ball and Stephen May", // Stephen May can be in this team since his team set
				TeamManagement.createDoctorTeam(D4,D1));  // to zero in before statement
	}

	@Test
	public void createDoctorTeamTest4() {
		assertEquals("A doctor team must include at least one consultant.",
				TeamManagement.createDoctorTeam(D4,D3));
	}

	
	
	

}
