package designpatterns.factorymethod.service.impl;

import designpatterns.factorymethod.domain.Vehicle;
import designpatterns.factorymethod.domain.impl.FourWheeler;
import designpatterns.factorymethod.service.VehicleService;

/**
 * The whole purpose of this class is to create vehicle object of type FourWheeler. 
 * 
 * This class overrides a method with only one intent, that is creating a specific object, and 
 * hence the method is called "factory method".
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public class FourWheelerService extends VehicleService {

	/**
	 * A factory method
	 */
	@Override
	protected Vehicle createVehicle() {
		return new FourWheeler();
	}

}
