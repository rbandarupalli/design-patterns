package designpatterns.structural.decorator.client;

import designpatterns.structural.decorator.domain.Car;
import designpatterns.structural.decorator.domain.DaytimeRunningLightsDecorator;
import designpatterns.structural.decorator.domain.LeatherSeatsDecorator;
import designpatterns.structural.decorator.domain.MultiPurposeVehicle;
import designpatterns.structural.decorator.domain.VehicleI;

/**
 * Just like in proxy, a decorator class also implements the same interface as that of the 
 * target it decorates.
 * Decorator class adds additional functionality dynamically to the source it's delegating 
 * requests to.
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public class Client {

	public static void main(String[] args) {
		VehicleI car = new Car();
		VehicleI mpv = new MultiPurposeVehicle();
		
		System.out.println("Car object was built with features: " + car.getCapabilities());
		
		// add additional features to the car
		System.out.println("After decorating, the car has these additional features:");
		VehicleI decoratedCar = new DaytimeRunningLightsDecorator(new LeatherSeatsDecorator(car));
		System.out.println(decoratedCar.getCapabilities());
		
		System.out.println("------ MPV ---------");
		System.out.println("MPV object was built with features: " + mpv.getCapabilities());
		
		// add additional features to the mpv
		VehicleI decoratedMpv = new DaytimeRunningLightsDecorator(mpv);
		System.out.println("After decorating, the MPV has these additional features:");
		System.out.println(decoratedMpv.getCapabilities());

	}

}
