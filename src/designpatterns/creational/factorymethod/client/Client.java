package designpatterns.creational.factorymethod.client;

import designpatterns.creational.factorymethod.service.VehicleService;
import designpatterns.creational.factorymethod.service.impl.FourWheelerService;
import designpatterns.creational.factorymethod.service.impl.TwoWheelerService;

public class Client {

	public static void main(String[] args) {
		VehicleService vehicleService = null;
		
		vehicleService = new TwoWheelerService();
		vehicleService.orderVehicle();

		vehicleService = new FourWheelerService();
		vehicleService.orderVehicle();
	}

}
