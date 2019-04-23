package designpatterns.structural.facade.subsystem.impl;

import designpatterns.structural.facade.subsystem.DeliveryService;

public class DeliveryServiceImpl implements DeliveryService {

	@Override
	public boolean isOrderDispatched(long orderId) {
		// actual implementation goes here
		return false;
	}

}
