package designpatterns.behavioral.mediator;

public class SalespersonParticipant extends Participant {

	public void processOrder() {
		// actual implementation goes here.
		setSalesStatusMessage("Sales team processed the order and the item is dispatched.");
		super.notifyMediator();
	}
	
	public String getSalesStatusMessage() {
		return salesStatusMessage;
	}
	public void setSalesStatusMessage(String salesStatusMessage) {
		this.salesStatusMessage = salesStatusMessage;
	}

	private String salesStatusMessage;
}
