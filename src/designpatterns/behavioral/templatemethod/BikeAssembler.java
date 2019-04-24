package designpatterns.behavioral.templatemethod;

import designpatterns.behavioral.templatemethod.domain.TwoWheeler;
import designpatterns.behavioral.templatemethod.domain.Vehicle;

public class BikeAssembler extends VehicleAssembler {

	@Override
	protected Vehicle buildVehicle() {
		System.out.println("Two wheeler object created.");
		return new TwoWheeler();
	}

	@Override
	protected void qualityCheck(Vehicle v) {
		// override functionality as required here
		super.qualityCheck(v);
		System.out.println("Specialized quality check completed for bike.");
		
	}

}
