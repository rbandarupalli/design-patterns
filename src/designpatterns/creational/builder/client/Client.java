package designpatterns.creational.builder.client;

import designpatterns.creational.builder.domain.FourWheeler;
import designpatterns.creational.builder.domain.TwoWheeler;
import designpatterns.creational.builder.Director;
import designpatterns.creational.builder.FourWheelerBuilder;
import designpatterns.creational.builder.TwoWheelerBuilder;

public class Client {

	public static void main(String[] args) {
		TwoWheelerBuilder bikeBuilder = new TwoWheelerBuilder();
		FourWheelerBuilder carBuilder = new FourWheelerBuilder();
		
		Director carDirector = new Director(carBuilder);
		carDirector.construct();
		FourWheeler buildedCar = carBuilder.getResult();
		System.out.println("Car object constructed with: " + carBuilder.getCompletedActions());
		buildedCar.prepareForDispatch();

		System.out.println();
		
		Director bikeDirector = new Director(bikeBuilder);
		bikeDirector.construct();
		TwoWheeler buildedBike = bikeBuilder.getResult();
		System.out.println("Bike object constructed with: " + bikeBuilder.getCompletedActions());
		buildedBike.prepareForDispatch();

	}

}
