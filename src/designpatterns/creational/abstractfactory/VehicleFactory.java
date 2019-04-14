package designpatterns.creational.abstractfactory;

import designpatterns.creational.abstractfactory.domain.Vehicle;

/**
 * An abstract factory. Every implementing class of this interface represents a family of 
 * related products, ie, all objects it creates would be from same product family.
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public interface VehicleFactory {
	
	Vehicle createTwoWheeler();
	Vehicle createFourWheeler();

}
