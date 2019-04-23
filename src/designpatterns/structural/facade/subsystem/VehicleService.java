package designpatterns.structural.facade.subsystem;

public interface VehicleService {
	long findVehicleCode(String model);
	long prepareForDispatch(long prodId);
	boolean isProcurementOrder(long orderId);

}
