package designpatterns.creational.abstractfactory;

import designpatterns.creational.abstractfactory.domain.Vehicle;
import designpatterns.creational.abstractfactory.domain.impl.indigenous.IndigenousFourWheeler;
import designpatterns.creational.abstractfactory.domain.impl.indigenous.IndigenousTwoWheeler;

public class IndigenousVehicleFactory implements VehicleFactory {
	@Override
	public Vehicle createTwoWheeler() {
		return new IndigenousTwoWheeler();
	}

	@Override
	public Vehicle createFourWheeler() {
		return new IndigenousFourWheeler();
	}

}
