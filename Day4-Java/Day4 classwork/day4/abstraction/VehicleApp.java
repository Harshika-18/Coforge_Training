package com.coforge.day4.abstraction;

public class VehicleApp {

	public static void main(String[] args) {
		/*Bike enfield = new Bike();
		enfield.brandName();
		enfield.noOfWheels();
		enfield.noOfEngines();

		Scooty vespa = new Scooty();
		vespa.brandName();
		vespa.noOfWheels();
		vespa.noOfEngines();*/
		
		VehiclePlan vehicle;
		
		vehicle = new Bike();
		vehicle.brandName();
		vehicle.noOfWheels();
		vehicle.noOfEngines();
		
		vehicle = new Scooty();
		vehicle.brandName();
		vehicle.noOfWheels();
		vehicle.noOfEngines();
		
	}

}
