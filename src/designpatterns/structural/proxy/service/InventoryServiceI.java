package designpatterns.structural.proxy.service;

public interface InventoryServiceI {
	long checkAvailability(long prodId);
	String getWarehouseInfo(long prodId);
}
