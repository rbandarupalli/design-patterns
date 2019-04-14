package designpatterns.creational.singleton;

import designpatterns.creational.singleton.domain.Vehicle;
import designpatterns.creational.singleton.domain.impl.indigenous.IndigenousFourWheeler;
import designpatterns.creational.singleton.domain.impl.indigenous.IndigenousTwoWheeler;

/**
 * A singleton class ensures only one instance of it exists in the system by returning the same
 * instance for all client requests to getInstance static method.
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public class IndigenousVehicleFactory implements VehicleFactory {

	public static VehicleFactory getInstance() {
		if(singleton == null) {
			synchronized (IndigenousVehicleFactory.class) {
				if(singleton == null) {
					singleton = new IndigenousVehicleFactory();
				}
			}
		}
		return singleton;
	}
	@Override
	public Vehicle createTwoWheeler() {
		return new IndigenousTwoWheeler();
	}

	@Override
	public Vehicle createFourWheeler() {
		return new IndigenousFourWheeler();
	}

	// prevent instance creation outside of this class.
	private IndigenousVehicleFactory() {}

	private static volatile VehicleFactory singleton = null;
}
