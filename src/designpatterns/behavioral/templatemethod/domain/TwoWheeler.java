package designpatterns.behavioral.templatemethod.domain;

public class TwoWheeler implements Vehicle {

	public void prepareForDispatch() {
		// vehicle preparation logic goes here...
		
		System.out.println("Two wheeler prepared for dispatch.");
	}

	public String getAcceptedFuelType() {
		return "Petrol";
	}

}
