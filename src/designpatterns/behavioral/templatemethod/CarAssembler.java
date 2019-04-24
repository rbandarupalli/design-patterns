package designpatterns.behavioral.templatemethod;

import designpatterns.behavioral.templatemethod.domain.FourWheeler;
import designpatterns.behavioral.templatemethod.domain.Vehicle;

public class CarAssembler extends VehicleAssembler {

	@Override
	protected Vehicle buildVehicle() {
		System.out.println("Four wheeler object created.");
		return new FourWheeler();
	}

	@Override
	protected void procureParts(Vehicle v) {
		super.procureParts(v);
		// required additional functionality goes here 
		System.out.println("Specialized parts procured for car.");
	}
}
