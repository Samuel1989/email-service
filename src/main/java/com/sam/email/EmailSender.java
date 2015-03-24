package com.sam.email;

import com.sendgrid.SendGrid;
import com.sendgrid.SendGrid.Email;
import com.sendgrid.SendGridException;

public class EmailSender {
	private SendGrid sendGrid;
	
	public EmailSender(String username, String password) {
		sendGrid = new SendGrid(username, password);
	}
	
	public void send(EmailObj emailObj) {
		Email email = new Email();
		email.addTo(emailObj.getRecipient());
		email.setFrom(emailObj.getSender());
		email.setSubject(emailObj.getSubject());
		email.setText(emailObj.getMessage());
		try {
			sendGrid.send(email);
		} catch (SendGridException e) {
			e.printStackTrace();
		}
	}

}
