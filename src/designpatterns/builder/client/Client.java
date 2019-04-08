package designpatterns.builder.client;

import designpatterns.builder.Director;
import designpatterns.builder.FourWheelerBuilder;
import designpatterns.builder.TwoWheelerBuilder;
import designpatterns.builder.domain.FourWheeler;
import designpatterns.builder.domain.TwoWheeler;

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
