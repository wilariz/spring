package com.apress.prospring3.ch2;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Service("messageProvider")
public class ConfigurableMessageProvider implements MessageProvider {

	private String message;
	
	@Autowired
	public ConfigurableMessageProvider(@Value("This is a configurable message")String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

}
