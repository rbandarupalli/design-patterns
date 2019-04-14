package designpatterns.creational.singleton;

import designpatterns.creational.singleton.domain.Vehicle;
import designpatterns.creational.singleton.domain.impl.imported.ImportedFourWheeler;
import designpatterns.creational.singleton.domain.impl.imported.ImportedTwoWheeler;

/**
 * A singleton class ensures only one instance of it exists in the system by returning the same
 * instance for all client requests to getInstance static method.
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public class ImportedVehicleFactory implements VehicleFactory {
	
	public static VehicleFactory getInstance() {
		if(singleton == null) {
			synchronized (ImportedVehicleFactory.class) {
				if(singleton == null) {
					singleton = new ImportedVehicleFactory();
				}
			}
		}
		return singleton;
	}

	@Override
	public Vehicle createTwoWheeler() {
		return new ImportedTwoWheeler();
	}

	@Override
	public Vehicle createFourWheeler() {
		return new ImportedFourWheeler();
	}

	// prevent instance creation outside of this class.
	private ImportedVehicleFactory() {}

	private static volatile VehicleFactory singleton = null;
}
