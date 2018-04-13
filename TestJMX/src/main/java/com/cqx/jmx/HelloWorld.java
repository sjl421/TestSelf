package com.cqx.jmx;

public class HelloWorld implements HelloWorldMBean {
	private String greeting;	
	public HelloWorld(String greeting){
		this.greeting = greeting;
	}
	public HelloWorld() {
        this.greeting = "hello world!";
    }
	@Override
	public String getGreeting() {
		return greeting;
	}
	@Override
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	@Override
	public void printGreeting() {
		System.out.println(greeting);
	}
}
