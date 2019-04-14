package designpatterns.creational.prototype.domain.impl;

import designpatterns.creational.prototype.domain.Vehicle;

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
	
	@Override
	public Vehicle createClone() {
		Vehicle retVal = null;
		// TODO Auto-generated method stub
		try {
			return (Vehicle) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return retVal;
		}
	}

	public TwoWheeler() {
		// any initialization logic goes here
		System.out.println("In the constructor, time consuming object creation logic executed to create "
				+ "a TwoWheeler instance.");
	}
	
	

}
