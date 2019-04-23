package designpatterns.structural.facade.subsystem;

public interface InventoryService {
	boolean checkInventory(long prodId);
	String getOrderStatus(long orderId);
}
