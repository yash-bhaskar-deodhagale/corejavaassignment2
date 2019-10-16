package com.yash.org.assignment.seven;

public class VehicleFactory extends AbstractFactory {
	   @Override
	   public Vehicle getVehicle(String vehicleType){    
	      if(vehicleType.equalsIgnoreCase("CAR")){
	         return new Car();         
	      }else if(vehicleType.equalsIgnoreCase("BIKE")){
	         return new Bike();
	      }	 
	      return null;
	   }
	}
