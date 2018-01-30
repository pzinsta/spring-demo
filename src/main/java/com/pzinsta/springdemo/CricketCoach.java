package com.pzinsta.springdemo;

public class CricketCoach implements Coach {

    private String email;
    private String team;

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
        System.out.println("fortune service setter");
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        System.out.println("email setter");
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("team setter");
        this.team = team;
    }

}
