package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
//		Read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		
//		Get the bean from spring container
		Coach theCoach = context.getBean("swimCoach", Coach.class);
		
//		Call a method on a bean
		System.out.println(theCoach.getDailyWorkout());
		
//		call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());	
		
//		Close the context
		context.close();
	}

}
