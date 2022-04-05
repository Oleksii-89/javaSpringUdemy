package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	private String email;
	private String team;
	
	

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		System.out.println("Inside setEmail method");
		this.email = email;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("Inside setTeam method");
		this.team = team;
	}


	// Create no-arg constructor
	public CricketCoach () {
		System.out.println("NO ARG CONSTRUCTOR");
	}
	
	
	//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter method");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
