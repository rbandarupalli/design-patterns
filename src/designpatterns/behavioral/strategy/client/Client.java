package designpatterns.behavioral.strategy.client;

import java.util.Random;

import designpatterns.behavioral.strategy.CityDriver;
import designpatterns.behavioral.strategy.TruckDriver;
import designpatterns.behavioral.strategy.VehicleDriverContext;
import designpatterns.behavioral.strategy.Driver;

/**
 * A strategy pattern.
 * 
 * Use when many alternative implementations available for clients to choose one from. 
 * Unlike the state pattern, the object won't change the strategy during its lifetime.
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public class Client {

	public static void main(String[] args) {
		// Based on the context client decides which strategy class to use.
		String context = "context requirements";

		// Driver context is created with a chosen strategy.
		VehicleDriverContext driverContext = new VehicleDriverContext(getDriverStrategy(context), context);
		String s = driverContext.drive();
		System.out.println(s);

	}
	
	/*
	 * Ideally strategies are obtained from a flyweight factory.
	 */
	private static Driver getDriverStrategy(String context) {
		// based on the context client decides which strategy to use.
		Random r = new Random();
		if(r.nextInt() % 2 == 0) { // context checking
			// truck driver is required
			return new TruckDriver();
		} else {
			return new CityDriver();
		}
	}

}
