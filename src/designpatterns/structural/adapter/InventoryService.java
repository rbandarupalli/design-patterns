package designpatterns.structural.adapter;

public interface InventoryService {
	public int checkAvailability(String model);
	public String getAcceptedFuelType(String model);
}
