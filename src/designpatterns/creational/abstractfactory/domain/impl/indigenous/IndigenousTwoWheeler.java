package designpatterns.creational.abstractfactory.domain.impl.indigenous;

import designpatterns.creational.abstractfactory.domain.Vehicle;

public class IndigenousTwoWheeler implements Vehicle {

	@Override
	public void prepareForDispatch() {
		// vehicle preparation logic goes here...
		System.out.println("Indigenous two wheeler prepared for dispatch.");
	}

	@Override
	public String getAcceptedFuelType() {
		return "Petrol";
	}

}
