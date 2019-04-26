package designpatterns.behavioral.mediator;

public class CustomerParticipant extends Participant {
	
	public void submitOrder() {
		setCustomerStatusMessage("Customer placed an order");
		super.notifyMediator();
	}
	
	public String getCustomerStatusMessage() {
		return customerStatusMessage;
	}

	public void setCustomerStatusMessage(String customerStatusMessage) {
		this.customerStatusMessage = customerStatusMessage;
	}

	private String customerStatusMessage;
}
