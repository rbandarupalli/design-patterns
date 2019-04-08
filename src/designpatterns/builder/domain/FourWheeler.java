package designpatterns.builder.domain;

public class FourWheeler {

	public void prepareForDispatch() {
		// vehicle preparation logic goes here...
		
		System.out.println("Four wheeler prepared for dispatch.");
	}

	public String getAcceptedFuelType() {
		return "BatteryPowered";
	}

}
