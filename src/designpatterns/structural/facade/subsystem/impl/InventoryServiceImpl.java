package designpatterns.structural.facade.subsystem.impl;

import designpatterns.structural.facade.subsystem.InventoryService;

public class InventoryServiceImpl implements InventoryService {

	@Override
	public boolean checkInventory(long prodId) {
		return false;
	}

	@Override
	public String getOrderStatus(long orderId) {
		// actual implementation goes here
		return "dispatched";
	}

}
