package com.nestjavatraining.springfoundation;

public class HockeyCoach implements Coach{
	
	@Override
	public String getDailyWorkout() {
		
		return "Spend 30 minutes on hockey practice";
	}
	
	@Override
	public String getDailyFortune() {
		
		return "Better luck next time";
	}

}
