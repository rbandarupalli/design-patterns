package designpatterns.structural.proxy.service;

/**
 * A real service implementation class.
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public class InventoryService implements InventoryServiceI {

	@Override
	public long checkAvailability(long prodId) {
		return 100;
	}

	@Override
	public String getWarehouseInfo(long prodId) {
		return "Warehouse-20";
	}

}
