package designpatterns.structural.facade.subsystem.impl;

import designpatterns.structural.facade.subsystem.VehicleService;

public class VehicleServiceImpl implements VehicleService {

	@Override
	public long findVehicleCode(String model) {
		// actual implementation goes here
		return 10;
	}

	@Override
	public long prepareForDispatch(long prodId) {
		// actual implementation goes here
		return 10;
	}

	@Override
	public boolean isProcurementOrder(long orderId) {
		// actual implementation goes here
		return true;
	}

}
