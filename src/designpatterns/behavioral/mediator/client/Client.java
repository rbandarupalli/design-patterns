package designpatterns.behavioral.mediator.client;

import designpatterns.behavioral.mediator.CustomerParticipant;
import designpatterns.behavioral.mediator.DeliverypersonParticipant;
import designpatterns.behavioral.mediator.OrderProcessingMediator;
import designpatterns.behavioral.mediator.SalespersonParticipant;

/**
 * The Mediator pattern.
 * 
 * Mediator encapsulates how the participants communicate. Participants do not know one another 
 * but only knows the mediator.
 * 
 * Unlike Observer where subject notifies all observers, here participants notifes mediator and
 * the mediator knows which specific participant the updates should be sent to. 
 *  
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public class Client {

	public static void main(String[] args) {
		// create participants
		CustomerParticipant customerParticipant = new CustomerParticipant();
		SalespersonParticipant salesParticipant = new SalespersonParticipant();
		DeliverypersonParticipant deliveryParticipant = new DeliverypersonParticipant();

		// mediator manages communication between participants
		OrderProcessingMediator mediator = new OrderProcessingMediator(customerParticipant, salesParticipant, 
				deliveryParticipant);
		
		customerParticipant.submitOrder();
		System.out.println("Message sent to sales participant: " + salesParticipant.getSalesStatusMessage());
		salesParticipant.processOrder();
		System.out.println("Message sent to delivery participant: " + deliveryParticipant.getDeliveryStatusMessage());
		deliveryParticipant.makeDelivery();
		System.out.println("Message from delivery participant: " + deliveryParticipant.getDeliveryStatusMessage());
	}

}
