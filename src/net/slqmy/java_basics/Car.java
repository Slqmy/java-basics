package net.slqmy.java_basics;

public class Car extends Vehicle {
	public Car(int wheels, String colour) {
		super(wheels, colour);

		// test is inherited from the Vehicle class.
		System.out.println(test);

		method();
	}

	// This constructor will be called if no arguments are passed.
	public Car(String colour) {
		super(4, colour);

		final int calculation = calculate();
	}

	public void handbrake() {

	}

	@Override
	public void activateBreaks() {
		handbrake();
	}
}
