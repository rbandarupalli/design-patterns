package designpatterns.creational.abstractfactory;

import designpatterns.creational.abstractfactory.domain.Vehicle;
import designpatterns.creational.abstractfactory.domain.impl.imported.ImportedFourWheeler;
import designpatterns.creational.abstractfactory.domain.impl.imported.ImportedTwoWheeler;

public class ImportedVehicleFactory implements VehicleFactory {
	@Override
	public Vehicle createTwoWheeler() {
		return new ImportedTwoWheeler();
	}

	@Override
	public Vehicle createFourWheeler() {
		return new ImportedFourWheeler();
	}

}
