package designpatterns.behavioral.chainofresponsibility;

import java.util.Random;

public class FourWheelerHandler extends Handler {

	public FourWheelerHandler() {
		super();
		// what other handler could handle the request if this handler can't
		super.successor = new RootHandler();
	}

	@Override
	public void procureParts(String contextInfo) {
		// handle the request here, and if it can't be handled then delegate it to 
		// the successor
		Random random = new Random();
		if(random.nextInt() % 2 == 0) {
			System.out.println("Four wheeler handler handled the request.");
 		} else {
			System.out.println("Four wheeler handler delegated the request to the successor.");
			successor.procureParts(contextInfo);
 		}
	}

}
