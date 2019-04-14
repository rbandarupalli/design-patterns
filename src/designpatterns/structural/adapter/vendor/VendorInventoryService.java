package designpatterns.structural.adapter.vendor;

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
