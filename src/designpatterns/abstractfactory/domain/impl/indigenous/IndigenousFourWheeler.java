package designpatterns.abstractfactory.domain.impl.indigenous;

import designpatterns.abstractfactory.domain.Vehicle;

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
