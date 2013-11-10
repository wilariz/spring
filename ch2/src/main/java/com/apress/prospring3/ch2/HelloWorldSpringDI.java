package com.apress.prospring3.ch2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpringDI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initialize Spring ApplicationContext
		ApplicationContext ctx = new ClassPathXmlApplicationContext
		("META-INF/spring/app-context.xml");
		MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
		mr.render();
	}

}
