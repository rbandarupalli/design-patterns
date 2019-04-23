package designpatterns.structural.bridge.abstraction;

public interface InventoryServiceI {
	long checkAvailability(long prodId);
	String getWarehouseInfo(long prodId);
}
