package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
//		Read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
//		Get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
//		Call a method on a bean
		boolean result = theCoach == alphaCoach;
		
		System.out.println("Pointer to same object: " + result);
		System.out.println("Memory Location theCoach: " + theCoach);
		System.out.println("Memory Location alphaCoach: " + alphaCoach);
		
//		Close the context
		context.close();
	}

}
