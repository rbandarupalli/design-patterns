package designpatterns.creational.singleton.client;

import designpatterns.creational.singleton.ImportedVehicleFactory;
import designpatterns.creational.singleton.IndigenousVehicleFactory;
import designpatterns.creational.singleton.VehicleFactory;
import designpatterns.creational.singleton.domain.Vehicle;

public class Client {

	public static void main(String[] args) {
		
		VehicleFactory vehicleFactorySingleton = IndigenousVehicleFactory.getInstance();
		Vehicle indigenousFourWheeler=  vehicleFactorySingleton.createFourWheeler();
		Vehicle indigenousTwoWheeler = vehicleFactorySingleton.createTwoWheeler();
		
		indigenousFourWheeler.prepareForDispatch();
		indigenousTwoWheeler.prepareForDispatch();
		
		System.out.println();
		// we can switch to another singleton factory
		vehicleFactorySingleton = ImportedVehicleFactory.getInstance();
		Vehicle importedFourWheeler = vehicleFactorySingleton.createFourWheeler();
		Vehicle importedTwoWheeler = vehicleFactorySingleton.createTwoWheeler();
		
		importedFourWheeler.prepareForDispatch();
		importedTwoWheeler.prepareForDispatch();
	}

}
