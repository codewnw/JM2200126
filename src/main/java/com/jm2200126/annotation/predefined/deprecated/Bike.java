package com.jm2200126.annotation.predefined.deprecated;

public class Bike {
	
	@Deprecated
	public void kickStart() {
		System.out.println("Kick started the bike.");
	}
	
	public void selfStart() {
		System.out.println("Self started the bike.");
	}

	public void move() {
		System.out.println("Bike is moving.");
	}

	public void stop() {
		System.out.println("Bike has stopped");
	}
}
