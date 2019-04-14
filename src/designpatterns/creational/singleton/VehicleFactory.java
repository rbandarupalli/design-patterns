package designpatterns.creational.singleton;

import designpatterns.creational.singleton.domain.Vehicle;

/**
 * Abstract factory like implementation but the implementing classes are made as singletons.
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public interface VehicleFactory {
	
	Vehicle createTwoWheeler();
	Vehicle createFourWheeler();
}

