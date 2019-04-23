package designpatterns.structural.facade;

import designpatterns.structural.facade.subsystem.DeliveryService;
import designpatterns.structural.facade.subsystem.InventoryService;
import designpatterns.structural.facade.subsystem.ProcurementService;
import designpatterns.structural.facade.subsystem.VehicleService;
import designpatterns.structural.facade.subsystem.impl.DeliveryServiceImpl;
import designpatterns.structural.facade.subsystem.impl.InventoryServiceImpl;
import designpatterns.structural.facade.subsystem.impl.ProcurementServiceImpl;
import designpatterns.structural.facade.subsystem.impl.VehicleServiceImpl;

public class UnifiedInterfaceImpl implements UnifiedInterface {

	@Override
	public long orderVehicle(String model) throws Exception {
		long vehicleCode = vService.findVehicleCode(model);
		boolean available = invService.checkInventory(vehicleCode);
		if(available) {
			return vService.prepareForDispatch(vehicleCode);
		} else {
			if(procService.procureVehicle(vehicleCode)) { 
				return vService.prepareForDispatch(vehicleCode);
			}
		}
		
		throw new Exception("Selected model not available");
	}

	@Override
	public String checkOrderStatus(long orderId) {
		if(delService.isOrderDispatched(orderId)) {
			return "dispatched";
		} else {
			if(vService.isProcurementOrder(orderId)) {
				return procService.getOrderStatus(orderId);
			} else {
				return invService.getOrderStatus(orderId);
			}
		}
	}
	
	private VehicleService vService = new VehicleServiceImpl();
	private InventoryService invService = new InventoryServiceImpl();
	private ProcurementService procService = new ProcurementServiceImpl();
	private DeliveryService delService = new DeliveryServiceImpl();

}
