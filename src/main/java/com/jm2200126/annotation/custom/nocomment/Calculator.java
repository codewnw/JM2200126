package com.jm2200126.annotation.custom.nocomment;

@ClassInfo(author = "Bob", reviewers = { "Martin", "Uncle Bob" }, version = 1, createdDate = "16-Feb-2020")
public class Calculator {

	@ClassInfo
	public int add(int a, int b) {
		return (a + b);
	}

	public int subtract(int a, int b) {
		return (a - b);
	}

}
