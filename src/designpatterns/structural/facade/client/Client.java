package designpatterns.structural.facade.client;

import designpatterns.structural.facade.UnifiedInterface;
import designpatterns.structural.facade.UnifiedInterfaceImpl;

/**
 * Facade pattern relieves client from dealing magnitude of interfaces by providing a 
 * higher level, single interface and there by letting client to deal with fewer classes. 
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public class Client {
	
	public static void main(String[] args) {
		UnifiedInterface facade = new UnifiedInterfaceImpl();
		try {
			long orderId = facade.orderVehicle("car model");
			System.out.println("order Id: " + orderId);
		} catch (Exception e) {
			// handle exception
			e.printStackTrace();
		}
		
		String orderStatus = facade.checkOrderStatus(10);
		System.out.println("Order status: " + orderStatus);

	}

}
