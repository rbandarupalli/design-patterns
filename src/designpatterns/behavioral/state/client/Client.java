package designpatterns.behavioral.state.client;

import designpatterns.behavioral.state.VehicleDriverContext;

/**
 * State pattern.
 * 
 * Object changes its behavior based on its current state. Unlike the strategy pattern, this 
 * state change can happen continuously back-and-forth during the life time of the object.
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public class Client {

	public static void main(String[] args) {
		VehicleDriverContext vDriver = new VehicleDriverContext(2);
		System.out.println(vDriver.drive());
		
		System.out.println();
		
		// changing the state alters the object's behavior.
		vDriver.setDrivingTimeHoursElapsed(6);
		System.out.println(vDriver.drive());
		
		System.out.println();
		vDriver.setDrivingTimeHoursElapsed(1);
		System.out.println(vDriver.drive());
	}

}
