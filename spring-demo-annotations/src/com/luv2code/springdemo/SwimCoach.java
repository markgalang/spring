package com.luv2code.springdemo;


public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "swim coach - daily WORKOUT";
	}

	@Override
	public String getDailyFortune() {
		return "swim coach - daily FORTUNE";
	}

}
