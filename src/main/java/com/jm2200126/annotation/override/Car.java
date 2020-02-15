package com.jm2200126.annotation.override;

public class Car extends Vehicle {

	@Override
	public void move() {
		System.out.println(this.getClass().getSimpleName() + " running");
	}
}
