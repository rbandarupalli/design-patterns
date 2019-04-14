package designpatterns.creational.factorymethod.service.impl;

import designpatterns.creational.factorymethod.domain.Vehicle;
import designpatterns.creational.factorymethod.domain.impl.TwoWheeler;
import designpatterns.creational.factorymethod.service.VehicleService;

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
