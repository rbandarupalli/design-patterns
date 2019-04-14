package designpatterns.structural.adapter;

import designpatterns.structural.adapter.vendor.VendorInventoryService;

/**
 * Delegates requests to adaptee.
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public class InventoryServiceAdapter implements InventoryService {

	public InventoryServiceAdapter() {
		adaptee = new VendorInventoryService();
	}
	
	@Override
	public int checkAvailability(String model) {
		return adaptee.checkVehicleAvailability(model);
	}

	@Override
	public String getAcceptedFuelType(String model) {
		return adaptee.fuelType(model);
	}
	
	private VendorInventoryService adaptee = null;

}
