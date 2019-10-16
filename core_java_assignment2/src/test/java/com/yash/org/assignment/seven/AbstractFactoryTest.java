package com.yash.org.assignment.seven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AbstractFactoryTest {
	
	@Test
	public void Test(){
	AbstractFactory vehicleFactory = FactoryProducer.getFactory(false);
    //get an object of Shape Rounded Rectangle
    Vehicle vehicleOne = vehicleFactory.getVehicle("CAR");
    //call draw method of Shape Rectangle
    vehicleOne.drive();
    //get an object of Shape Rounded Square 
    Vehicle vehicleTwo = vehicleFactory.getVehicle("BIKE");
    //call draw method of Shape Square
    vehicleTwo.drive();
    assertEquals(true,vehicleOne instanceof Car);
	}
	

}
