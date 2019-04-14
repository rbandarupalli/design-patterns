package designpatterns.creational.prototype.domain.impl;

import designpatterns.creational.prototype.domain.Vehicle;

public class FourWheeler implements Vehicle {

	@Override
	public void prepareForDispatch() {
		// vehicle preparation logic goes here...
		
		System.out.println("Four wheeler prepared for dispatch.");
		
	}

	@Override
	public String getAcceptedFuelType() {
		return "BatteryPowered";
	}
	
	@Override
	public Vehicle createClone() {
		Vehicle retVal = null;
		try {
			return (Vehicle) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return retVal;
		}
	}
	
	public FourWheeler() {
		// any initialization logic goes here
		System.out.println("In the constructor, time consuming object creation logic executed to create "
				+ "a FourWheeler instance.");
	}

}
