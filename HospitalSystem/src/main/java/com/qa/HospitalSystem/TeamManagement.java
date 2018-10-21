package com.qa.HospitalSystem;

public class TeamManagement extends HospitalManagement {
	
	private static int counterteam=0;
	
	// replace String doctor with actual object (also make same method with
	// 3 and 4 parameters also
	

	
	//System.out.println(D1.getID());
	
	public static String createDoctorTeam(Doctors D1, Doctors D2) {
		
		if(D1.getTeam()==D2.getTeam() && D1.getTeam()!=0) {
		return 	"Team "+D1.getTeam()+": " +D1.getName()+" and "+D2.getName(); // if doctors already form a team
		}
	    else if(D1.getTeam()==0 && D2.getTeam()==0) { // doctors cannot be in two teams
		counterteam++;
		D1.setTeam(counterteam);		
		D2.setTeam(counterteam);
		return "Team "+D1.getTeam()+": " +D1.getName()+" and "+D2.getName();
		} else {
			return "A doctor cannot be in two teams.";
		}

	}
	
}
