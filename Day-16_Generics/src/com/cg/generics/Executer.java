package com.cg.generics;

public class Executer {

	public static void main(String[] args) 
	{
		//create a sender to send string message
		Sender<String> stringSender = new Sender<String>();
		stringSender.setMessage("Hello from JAVA!");
		stringSender.sendMessage();
		
		//create an email object to be send using sender
		Email myEamil = new Email();
		myEamil.setFrom("test@igate.com");
		myEamil.setTo("admin@igate.com");
		myEamil.setSubject("Need to block cafeteria for personal event");
		myEamil.setBody("To celebrate IGATE birthday");
		
		//create a sender to send this email
		Sender<Email> emailSender = new Sender<Email>();
		emailSender.setMessage(myEamil);
		emailSender.sendMessage();
	}

}
