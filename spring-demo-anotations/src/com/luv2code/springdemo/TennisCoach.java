package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("Default constructor");
	}
	
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("START");
	}
	
	@PreDestroy
	public void doMyClean() {
		System.out.println("FINISH");
	}
	
	
//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService) {
//		System.out.println("SETTER constructor");
//
//		fortuneService = theFortuneService;
//	}
	
	
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		this.fortuneService = theFortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Prak your back hz";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
