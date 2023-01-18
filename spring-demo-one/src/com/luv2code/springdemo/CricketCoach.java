package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("Cricket coach - inside no args constructor");	
	}
	
	

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside setter function");
		this.fortuneService = fortuneService;
	}
	
	



	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		System.out.println("email address setter");
		this.emailAddress = emailAddress;
	}



	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		System.out.println("team setter");
		this.team = team;
	}



	@Override
	public String getDailyWorkout() {
		return "Practice ast bowling for 1 5mins";
	}

	@Override
	public String getDailyFortung() {
		return fortuneService.getFortune();
	}

}
