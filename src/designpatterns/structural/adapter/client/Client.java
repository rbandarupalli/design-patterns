package designpatterns.structural.adapter.client;

import designpatterns.structural.adapter.InventoryService;
import designpatterns.structural.adapter.InventoryServiceAdapter;

/**
 * Client expects a different interface than what is available from vendor library. So, client 
 * uses an adapter class that delegates requests to vendor library class.
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public class Client {

	public static void main(String[] args) {
		InventoryService inventorySvc = new InventoryServiceAdapter();
		int availableCount = inventorySvc.checkAvailability("twoWheeler");
		String fuelType = inventorySvc.getAcceptedFuelType("twoWheeler");

		System.out.println(availableCount);
		System.out.println(fuelType);
	}
}
