package designpatterns.factorymethod.service.impl;

import designpatterns.factorymethod.domain.Vehicle;
import designpatterns.factorymethod.domain.impl.TwoWheeler;
import designpatterns.factorymethod.service.VehicleService;

/**
 * The whole purpose of this class is to create vehicle object of type TwoWheeler. 
 * 
 * This class overrides a method with only one intent, that is creating a specific object, and 
 * hence the method is called "factory method".
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public class TwoWheelerService extends VehicleService {

	/**
	 * A factory method
	 */
	@Override
	protected Vehicle createVehicle() {
		return new TwoWheeler();
	}

}
