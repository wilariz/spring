package com.apress.prospring3.ch2;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service("messageRenderer")
public class StandardOutMessageRenderer implements MessageRenderer {
	
	private MessageProvider messageProvider = null;
	
	public void render() {
		if (messageProvider == null) {
			throw new RuntimeException("You must set the property messageProvider of class:"
			+ StandardOutMessageRenderer.class.getName());
		}
		System.out.println(messageProvider.getMessage());
	}
	
	public void setMessageProvider(MessageProvider provider) {
		this.messageProvider = provider;
	}
	
	@Autowired()
	public MessageProvider getMessageProvider() {
		return this.messageProvider;
	}

}
