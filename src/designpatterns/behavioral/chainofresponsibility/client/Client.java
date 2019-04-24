package designpatterns.behavioral.chainofresponsibility.client;

import designpatterns.behavioral.chainofresponsibility.FourWheelerHandler;
import designpatterns.behavioral.chainofresponsibility.Handler;
import designpatterns.behavioral.chainofresponsibility.TwoWheelerHandler;

/**
 * Chain of responsibility pattern.
 * 
 * A handler has handler chain, most appropriate handler for the given request context 
 * will handle the request.
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public class Client {

	public static void main(String[] args) {
		// depending on the context, an appropriate handler is created
		Handler handler = new FourWheelerHandler();
		handler.procureParts("vehicle info");
		
		System.out.println();
		
		handler = new TwoWheelerHandler();
		handler.procureParts("vehicle info");
		
	}

}
