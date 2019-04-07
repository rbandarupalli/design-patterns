package designpatterns.factorymethod.client;

import designpatterns.factorymethod.service.VehicleService;
import designpatterns.factorymethod.service.impl.FourWheelerService;
import designpatterns.factorymethod.service.impl.TwoWheelerService;

public class Tester {

	public static void main(String[] args) {
		VehicleService vehicleService = null;
		
		vehicleService = new TwoWheelerService();
		vehicleService.orderVehicle();

		vehicleService = new FourWheelerService();
		vehicleService.orderVehicle();
	}

}
