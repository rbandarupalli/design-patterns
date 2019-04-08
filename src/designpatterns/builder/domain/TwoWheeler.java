package designpatterns.builder.domain;

public class TwoWheeler {

	public void prepareForDispatch() {
		// vehicle preparation logic goes here...
		
		System.out.println("Two wheeler prepared for dispatch.");
	}

	public String getAcceptedFuelType() {
		return "Petrol";
	}

}
