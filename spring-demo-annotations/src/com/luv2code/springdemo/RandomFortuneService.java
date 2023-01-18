package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	
	private String[] data = {
			"fortune1",
			"fortune2",
			"fortune3",
			"fortune4",
			"fortune5",
			"fortune6",
			"fortune7",
			"fortune8",
			"fortune9",
			"fortune10",
	};
	
	private Random myRandom = new Random();
	
	
	
	@Override
	public String getFortune() {
		
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
