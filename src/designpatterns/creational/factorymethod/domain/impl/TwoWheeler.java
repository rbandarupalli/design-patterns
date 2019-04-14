package designpatterns.creational.factorymethod.domain.impl;

import designpatterns.creational.factorymethod.domain.Vehicle;

public class TwoWheeler implements Vehicle {

	@Override
	public void prepareForDispatch() {
		// vehicle preparation logic goes here...
		System.out.println("Two wheeler prepared for dispatch.");
	}

	@Override
	public String getAcceptedFuelType() {
		return "Petrol";
	}

}
