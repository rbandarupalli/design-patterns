package designpatterns.abstractfactory;

import designpatterns.abstractfactory.domain.Vehicle;
import designpatterns.abstractfactory.domain.impl.imported.ImportedFourWheeler;
import designpatterns.abstractfactory.domain.impl.imported.ImportedTwoWheeler;

public class ImportedVehicleFactory implements VehicleFactory {

	@Override
	public Vehicle createTwoWheeler() {
		// TODO Auto-generated method stub
		return new ImportedTwoWheeler();
	}

	@Override
	public Vehicle createFourWheeler() {
		// TODO Auto-generated method stub
		return new ImportedFourWheeler();
	}

}
