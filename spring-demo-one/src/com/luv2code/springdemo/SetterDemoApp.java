package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
//		Load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		Retrieve a bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
//		Call methods on bead
		System.out.println(theCoach.getDailyWorkout());	
		System.out.println(theCoach.getDailyFortung());	
		
		System.out.println(theCoach.getEmailAddress());	
		System.out.println(theCoach.getTeam());	
		
//		Close the context
		context.close();

	}

}
