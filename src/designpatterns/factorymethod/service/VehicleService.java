package designpatterns.factorymethod.service;

import designpatterns.factorymethod.domain.Vehicle;

/**
 * This class can't anticipate what vehicle to create so it uses a factory method to 
 * delegate the vehicle creation to its subclasses.
 * 
 * We will have as many implementing classes as many product types. In other words, factory 
 * method implementing class hierarchy parallels the product hierarchy. 
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public abstract class VehicleService {

	public void orderVehicle() {

		// we don't know what object to create, so call a factory method 
		Vehicle vehicle = createVehicle();
		
		// other business logic goes here
		
		vehicle.prepareForDispatch();	

	}
	

	
	/**
	 * This is a factory method, sub-classes will create actual object.
	 * So, this parent class delegates object creation to its sub-classes.
	 * 
	 * @return
	 */
	protected abstract Vehicle createVehicle();
	
}
