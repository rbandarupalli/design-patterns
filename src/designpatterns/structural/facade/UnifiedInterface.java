package designpatterns.structural.facade;

/**
 * A facade interface.
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public interface UnifiedInterface {
	
	long orderVehicle(String model) throws Exception;
	String checkOrderStatus(long orderId);

}
