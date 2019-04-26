package designpatterns.behavioral.mediator;

public class DeliverypersonParticipant extends Participant {

	public void makeDelivery() {
		// actual implementation goes here.
		setDeliveryStatusMessage("Delivery done by delivery person.");
		setDeliveryComplete(true);
		super.notifyMediator();
	}
	
	public String getDeliveryStatusMessage() {
		return deliveryStatusMessage;
	}

	public void setDeliveryStatusMessage(String deliveryStatusMessage) {
		this.deliveryStatusMessage = deliveryStatusMessage;
	}

	public boolean isDeliveryComplete() {
		return deliveryComplete;
	}

	public void setDeliveryComplete(boolean deliveryComplete) {
		this.deliveryComplete = deliveryComplete;
	}


	private boolean deliveryComplete;
	private String deliveryStatusMessage;
}
