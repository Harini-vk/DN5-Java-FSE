package com.cognizant.week1.singleton;

public class Logger {
	
	private static Logger instance;
	
	private Logger() {
		System.out.println("Logger with private instance created");
	}
	
	public static Logger getInstance() {
		if(instance == null) {
		    instance = new Logger();
		}

		return instance;

	}

}
