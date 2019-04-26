package designpatterns.behavioral.mediator;

public class OrderProcessingMediator implements Mediator {

	public OrderProcessingMediator(CustomerParticipant customer, SalespersonParticipant salesperson,
			DeliverypersonParticipant deliveryParticipant) {
		this.customer = customer;
		this.salesperson = salesperson;
		this.deliveryParticipant = deliveryParticipant;
		
		this.customer.setMediator(this);
		this.salesperson.setMediator(this);
		this.deliveryParticipant.setMediator(this);
	}

	@Override
	public void routeMessage(Participant participant) {
		if(participant instanceof CustomerParticipant) {
			String msg = ((CustomerParticipant) participant).getCustomerStatusMessage();
			salesperson.setSalesStatusMessage(msg);
		} else if(participant instanceof SalespersonParticipant) {
			String msg = ((SalespersonParticipant) participant).getSalesStatusMessage();
			deliveryParticipant.setDeliveryStatusMessage(msg);
		} else if(participant instanceof DeliverypersonParticipant) {
			DeliverypersonParticipant delParticipant = ((DeliverypersonParticipant) participant);
			if(deliveryParticipant.isDeliveryComplete()) {
				System.out.println("Order completed");
			} else {
				// follow up workflow goes here with other participants
				System.out.println("Pending order delivery");
			}
		}
	}

	private CustomerParticipant customer;
	private SalespersonParticipant salesperson;
	private DeliverypersonParticipant deliveryParticipant;
	
}
