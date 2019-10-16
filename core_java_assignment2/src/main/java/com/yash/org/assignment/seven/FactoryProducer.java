package com.yash.org.assignment.seven;

public class FactoryProducer {
	public static AbstractFactory getFactory(boolean rounded) {
		return new VehicleFactory();
	}
}
