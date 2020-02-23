package com.jm2200126.annotation.custom.test;

public class CalculatorTest {

	@Test
	public void method1() {
		System.out.println("M1: Running");
	}

	@Test(enabled = true)
	public void method2() {
		System.out.println("M2: Running");
	}

	@Test(enabled = false)
	public void method3() {
		System.out.println("M3: Running");
	}

	public void method4() {
		System.out.println("M4: Running");
	}
}
