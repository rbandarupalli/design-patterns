package designpatterns.structural.bridge.client;

import designpatterns.structural.bridge.abstraction.InventoryService;
import designpatterns.structural.bridge.abstraction.InventoryServiceI;

/**
 * An abstract class allows sharing some of the common functionality with its multiple 
 * implementations, but inheritance binds both abstract and implementation classes.
 * 
 *  Use bridge pattern when changes to implementations are anticipated and you want to immune 
 *  clients from those changes.
 * 
 * Bridge pattern separates an implementation from its abstraction so that the both can vary 
 * independently. Both abstraction and implementation interfaces can change independently without
 * affecting another, ie, upon a change in one the other won't need to be recompiled.
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public class Client {

	public static void main(String[] args) {
		InventoryServiceI invService = new InventoryService();
		long inventory = invService.checkAvailability(10);
		String warehouseInfo = invService.getWarehouseInfo(10);
		
		System.out.println("Available inventory: " +inventory);
		System.out.println("Warehouse info: " + warehouseInfo);
	}
}
