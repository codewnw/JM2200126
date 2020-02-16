package com.jm2200126.annotation.predefined.override;

public class Vehicle {

	public void start() {
		System.out.println(this.getClass().getSimpleName() + " started");
	}

	public void move() {
		System.out.println(this.getClass().getSimpleName() + " is moving");
	}

	public void stop() {
		System.out.println(this.getClass().getSimpleName() + " stopped");
	}
}
