package designpatterns.creational.abstractfactory.domain.impl.imported;

import designpatterns.creational.abstractfactory.domain.Vehicle;

public class ImportedTwoWheeler implements Vehicle {

	@Override
	public void prepareForDispatch() {
		// vehicle preparation logic goes here...
		System.out.println("Imported two wheeler prepared for dispatch.");
	}

	@Override
	public String getAcceptedFuelType() {
		return "Petrol";
	}

}
