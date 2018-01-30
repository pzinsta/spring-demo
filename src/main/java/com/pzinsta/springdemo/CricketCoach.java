package com.pzinsta.springdemo;

public class CricketCoach implements Coach {
    
    private FortuneService fortuneService;
    
    public CricketCoach() {
        System.out.println("No-arg constructor");
    }
    
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Setter");
        this.fortuneService = fortuneService;
    }
    
}
