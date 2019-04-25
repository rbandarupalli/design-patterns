package designpatterns.structural.bridge.implementation;

public interface VehicleServiceI {
	long checkInventory(String prodCode);
	String getWarehouseInfo(String prodCode);
	String getProductCode(long prodId);
}
