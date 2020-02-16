package com.jm2200126.annotation.predefined.supressewarnnings;

public class Rider {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.kickStart();
		bike.move();
		bike.stop();
	}

}
