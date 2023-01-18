package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		Retrieve a bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
//		Call methods on bead
		System.out.println(theCoach.getDailyWorkout());	
		System.out.println(theCoach.getDailyFortung());	
		
//		Close the context
		context.close();

	}

}
