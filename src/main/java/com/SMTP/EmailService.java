package com.SMTP;

public interface EmailService {
	public String sendSimpleMail(EmailDetails ed);
	public String sendmailwithAttach(EmailDetails ed);

}
