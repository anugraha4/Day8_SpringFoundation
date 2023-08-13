package com.nestjavatraining.springfoundation;


public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	
	
	
	
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		
		System.out.println("Inside setter method setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Spend 40 minutes on cricket practice";
	}
	
	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

	

}
