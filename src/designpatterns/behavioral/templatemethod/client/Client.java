package designpatterns.behavioral.templatemethod.client;

import designpatterns.behavioral.templatemethod.BikeAssembler;
import designpatterns.behavioral.templatemethod.CarAssembler;
import designpatterns.behavioral.templatemethod.VehicleAssembler;
import designpatterns.behavioral.templatemethod.domain.Vehicle;

public class Client {

	public static void main(String[] args) {
		VehicleAssembler vAssembler = new BikeAssembler();
		Vehicle vehicle = vAssembler.assemble(); // template method
		vehicle.prepareForDispatch();
		
		System.out.println();
		
		vAssembler = new CarAssembler();
		vehicle = vAssembler.assemble();
		vehicle.prepareForDispatch();
	}

}
