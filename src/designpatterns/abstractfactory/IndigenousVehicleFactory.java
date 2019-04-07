package designpatterns.abstractfactory;

import designpatterns.abstractfactory.domain.Vehicle;
import designpatterns.abstractfactory.domain.impl.indigenous.IndigenousFourWheeler;
import designpatterns.abstractfactory.domain.impl.indigenous.IndigenousTwoWheeler;


public class IndigenousVehicleFactory implements VehicleFactory {

	@Override
	public Vehicle createTwoWheeler() {
		// 
		return new IndigenousTwoWheeler();
	}

	@Override
	public Vehicle createFourWheeler() {
		return new IndigenousFourWheeler();
	}

}
