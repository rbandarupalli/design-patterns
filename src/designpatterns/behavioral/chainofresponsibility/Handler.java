package designpatterns.behavioral.chainofresponsibility;

/**
 * When implementing classes cannot handle a request they can either dynamically switch to 
 * an appropriate successor handler based on the context information or define explicitly a 
 * standard successor or leave it null.
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public abstract class Handler {

	public void procureParts(String contextInfo) {
		// generic implementation goes here
		System.out.println("Generic handler handled the request.");
	}
	
	protected Handler successor;
}
