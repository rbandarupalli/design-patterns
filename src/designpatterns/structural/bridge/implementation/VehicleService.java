package designpatterns.structural.bridge.implementation;

public class VehicleService implements VehicleServiceI {

	@Override
	public long checkInventory(String prodCode) {
		// actual implementation goes here
		return 100;
	}

	@Override
	public String getWarehouseInfo(String prodCode) {
		// actual implementation goes here
		return "warehouse-100";
	}

	@Override
	public String getProductCode(long prodId) {
		// actual implementation goes here
		return "10";
	}
}
