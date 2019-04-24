package designpatterns.behavioral.templatemethod.domain;

public class FourWheeler implements Vehicle {

	public void prepareForDispatch() {
		// vehicle preparation logic goes here...
		
		System.out.println("Four wheeler prepared for dispatch.");
	}

	public String getAcceptedFuelType() {
		return "BatteryPowered";
	}

}
