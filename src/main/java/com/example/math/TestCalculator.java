package com.example.math;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
	
	public void multiply() {
        Calculator calculator = new Calculator();
        assertEquals(20, calculator.multiply(10, 2));
    }

public void multiply2() {
        Calculator calculator = new Calculator();
        assertEquals(20, calculator.multiply(10, 2));
    }

}
