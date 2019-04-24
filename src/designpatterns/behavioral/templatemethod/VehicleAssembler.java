package designpatterns.behavioral.templatemethod;

import designpatterns.behavioral.templatemethod.domain.Vehicle;

/**
 * Template method pattern.
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public abstract class VehicleAssembler {
	// template method
	public Vehicle assemble() {
		Vehicle v = buildVehicle();
		procureParts(v);
		qualityCheck(v);
		return v;
	}
	
	protected void procureParts(Vehicle v) {
		// common functionality goes here
		System.out.println("Parts procured.");
	}
	
	// factory method
	protected abstract Vehicle buildVehicle();

	protected void qualityCheck(Vehicle v) {
		// common functionality goes here
		System.out.println("Quality check completed.");
	}
}
