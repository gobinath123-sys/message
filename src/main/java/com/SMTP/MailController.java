package com.SMTP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {
	@Autowired
	MailService ms;

	@PostMapping("/send")
	public String send(@RequestBody EmailDetails details) {
		return ms.sendSimpleMail(details);
	}
	@PostMapping("/send1")
	public String send1(@RequestBody EmailDetails details) {
		return ms.sendMailWithAttachment(details);
	}

}
