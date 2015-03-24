package com.sam.email.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sam.email.EmailObj;
import com.sam.email.EmailSender;

@RestController
public class EmailController {
	
	@RequestMapping(value = "/rest/sendemail", method = RequestMethod.POST)
	public String sendEmail(@RequestBody EmailObj emailObj) {
		EmailSender eSender = new EmailSender("", "");
		return eSender.send(emailObj);
	}

}
