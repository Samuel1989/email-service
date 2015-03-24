package com.sam.email;

public class EmailObj {
	private String[] recipients;
	private String[] copyRecipients;
	private String[] blindRecipients;
	private String message;
	private String sender;
	private String subject;
	
	public EmailObj() {  }
	
	public EmailObj(String[] recipients, String[] copyRecipients, String[] blindRecipients, String sender, String subject, String message) {
		this.recipients = recipients;
		this.sender = sender;
		this.subject = subject;
		this.message = message;
		this.copyRecipients = copyRecipients;
		this.blindRecipients = blindRecipients;
	}
	
	public void setRecipients(String[] recipient) {
		this.recipients = recipient;
	}
	
	public void setCopyRecipients(String[] copyRecipient) {
		this.copyRecipients = copyRecipient;
	}
	
	public void setBlindRecipients(String[] blindRecipient) {
		this.blindRecipients = blindRecipient;
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
	
	public String[] getRecipients() {
		return recipients;
	}
	
	public String[] getCopyRecipients() {
		return copyRecipients;
	}
	
	public String[] getBlindRecipients() {
		return blindRecipients;
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
