package designpatterns.structural.facade.subsystem.impl;

import designpatterns.structural.facade.subsystem.ProcurementService;

public class ProcurementServiceImpl implements ProcurementService {

	@Override
	public boolean procureVehicle(long prodId) {
		// actual implementation goes here
		return true;
	}

	@Override
	public String getOrderStatus(long orderId) {
		// actual implementation goes here
		return "dispatched";
	}

}
