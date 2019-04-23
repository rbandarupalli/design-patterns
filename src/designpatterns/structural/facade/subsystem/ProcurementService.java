package designpatterns.structural.facade.subsystem;

public interface ProcurementService {
	boolean procureVehicle(long prodId);
	String getOrderStatus(long orderId);
}
