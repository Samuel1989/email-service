package com.sam.email.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {
	private String username;
	private String password;
	
	public Configuration() {
		Properties properties = new Properties();
		InputStream input = this.getClass().getResourceAsStream("/config.properties");
		try {
			properties.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}

		username = properties.getProperty("username");
		password = properties.getProperty("password");
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}	

}
