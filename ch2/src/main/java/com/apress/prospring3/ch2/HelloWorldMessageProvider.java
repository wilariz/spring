package com.apress.prospring3.ch2;

import org.springframework.stereotype.Service;

@Service("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider {

	public String getMessage() {
		// TODO Auto-generated method stub
		return "Hello World!";
	}

}
