package designpatterns.structural.adapter.vendor;

/**
 * A library class client cannot modify.
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public class VendorInventoryService {
	
	public int checkVehicleAvailability(String model) {
		// necessary logic goes here
		return 10;
	}
	
	public String fuelType(String model) {
		// necessary logic goes here
		return "Electricity";
	}
}
