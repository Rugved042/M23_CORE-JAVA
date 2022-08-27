package com.cg.generics;

//1.Email 2. Sender 3. Executer

public class Email 
{
	// Email format
	// private variables
	
	private String from;
	private String to;
	private String subject;
	private String body;
	
	//getter and setters method for private variable
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
}