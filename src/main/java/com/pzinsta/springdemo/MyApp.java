package com.pzinsta.springdemo;

public class MyApp {

	public static void main(String[] args) {

		// create the object
		// Coach theCoach = new BaseballCoach();
		Coach theCoach = new TrackCoach(new HappyFortuneService());
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());		
	}

}
