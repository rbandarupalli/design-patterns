package designpatterns.structural.proxy.local;

import designpatterns.structural.proxy.service.InventoryService;
import designpatterns.structural.proxy.service.InventoryServiceI;;

/**
 * A class that acts as a proxy for a real service.
 * Clients use this proxy to invoke methods on the real service.
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public class InventoryServiceProxy implements InventoryServiceI {
	
	InventoryServiceI realService = null;
	
	public InventoryServiceProxy() {
		this.realService = new InventoryService();
	}

	@Override
	public long checkAvailability(long prodId) {
		// delegate request to real service
		return this.realService.checkAvailability(prodId);

	}

	@Override
	public String getWarehouseInfo(long prodId) {
		// proxy can restrict access to certain methods
		// ideally an exception will be thrown here.
		return "Requested operation not supported";
	}

}
