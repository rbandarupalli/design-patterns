package designpatterns.creational.singleton.domain.impl.indigenous;

import designpatterns.creational.singleton.domain.Vehicle;

public class IndigenousFourWheeler implements Vehicle {

	@Override
	public void prepareForDispatch() {
		// vehicle preparation logic goes here...
		
		System.out.println("Indigenous four wheeler prepared for dispatch.");
		
	}

	@Override
	public String getAcceptedFuelType() {
		return "BatteryPowered";
	}

}
