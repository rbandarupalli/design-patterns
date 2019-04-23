package designpatterns.structural.bridge.abstraction;

import designpatterns.structural.bridge.implementation.VehicleService;
import designpatterns.structural.bridge.implementation.VehicleServiceI;

/**
 * A service implementation class that derives much of its functionality from another implementation
 * class.
 * 
 * The implementation in this abstraction can change independent of actual service 
 * implementation, ie, any changes to interface methods.
 * 
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public class InventoryService implements InventoryServiceI {

	public InventoryService() {
		super();
		this.service = new VehicleService();
	}

	@Override
	public long checkAvailability(long prodId) {
		String productCode = service.getProductCode(prodId);
		// Any additional functionality added here can change without affecting actual service
		// implementation.
		return service.checkInventory(productCode);
	}

	@Override
	public String getWarehouseInfo(long prodId) {
		String productCode = service.getProductCode(prodId);
		System.out.println("getting warehouse info");
		return service.getWarehouseInfo(productCode);
	}

	private VehicleServiceI service;
}
