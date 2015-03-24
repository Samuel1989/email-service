package com.sam.email;

public class EmailObj {
	private String recipient;
	private String message;
	private String sender;
	private String subject;
	
	public EmailObj() {  }
	
	public EmailObj(String recipient, String sender, String subject, String message) {
		this.recipient = recipient;
		this.sender = sender;
		this.subject = subject;
		this.message = message;
	}
	
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	
	public void setSender(String sender) {
		this.sender = sender;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getRecipient() {
		return recipient;
	}
	
	public String getSender() {
		return sender;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public String getMessage() {
		return message;
	}

}
