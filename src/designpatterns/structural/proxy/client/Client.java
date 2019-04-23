package designpatterns.structural.proxy.client;

import designpatterns.structural.proxy.local.InventoryServiceProxy;
import designpatterns.structural.proxy.service.InventoryServiceI;

/**
 * Client access a service through a proxy. Both proxy and service implement SAME interface but 
 * proxy can restrict access to certain methods.
 * 
 * Client will be unaware where the real implementation is.
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public class Client {

	public static void main(String[] args) {
		
		// we don't know where is the real service but we access it through a proxy
		InventoryServiceI serviceProxy = new InventoryServiceProxy();
		
		System.out.println("Availability: " + serviceProxy.checkAvailability(10));
		
		// proxy has restricted the access to this method.
		System.out.println("Warehouse details: " + serviceProxy.getWarehouseInfo(10));

	}

}
