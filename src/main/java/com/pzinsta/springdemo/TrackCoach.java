package com.pzinsta.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;
    
	public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

    @Override
    public String getDailyFortune() {
        return "Just Do It: " + fortuneService.getFortune();
    }
    
    public void doMyStartupStuff() {
        System.out.println("init method");
    }
    
    public void doMyCleanUpStuff() {
        System.out.println("destroy method");
    }

}










