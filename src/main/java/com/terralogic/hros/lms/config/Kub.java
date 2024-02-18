package com.terralogic.hros.lms.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public class Kub {
	
	@Autowired
	private Environment environment;
	
	 

	    public String getUsername() {
	        return environment.getProperty("DB_USERNAME");
	    }

	    public String getPassword() {
	        return environment.getProperty("DB_PASSWORD");
	    }
	}