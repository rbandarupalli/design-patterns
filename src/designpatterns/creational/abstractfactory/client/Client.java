package designpatterns.creational.abstractfactory.client;

import designpatterns.creational.abstractfactory.ImportedVehicleFactory;
import designpatterns.creational.abstractfactory.IndigenousVehicleFactory;
import designpatterns.creational.abstractfactory.VehicleFactory;
import designpatterns.creational.abstractfactory.domain.Vehicle;


public class Client {

	public static void main(String[] args) {
		VehicleFactory abstractFactory = null;
		
		System.out.println("Indigenous abstract factory creates only indigenous products");
		
		// all vehicles created by this abstract factory are indigenous
		abstractFactory = new IndigenousVehicleFactory();
		prepareForDispatch(abstractFactory);
		
		System.out.println();
		System.out.println("Imported abstract factory creates only imported products");
		
		// all vehicles created by this abstract factory are of type imported.
		abstractFactory = new ImportedVehicleFactory();
		prepareForDispatch(abstractFactory);

	}

	private static void prepareForDispatch(VehicleFactory abstractVehicleFactory) {
		Vehicle fourWheeler = abstractVehicleFactory.createFourWheeler();
		Vehicle twoWheeler = abstractVehicleFactory.createTwoWheeler();
		
		fourWheeler.prepareForDispatch();
		twoWheeler.prepareForDispatch();
	}

}
