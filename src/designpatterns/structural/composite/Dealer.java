package designpatterns.structural.composite;

/**
 * A leaf.
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public class Dealer extends DistributionNetwork {

	@Override
	public boolean checkAvailability(String carModel) {
		// actual implementation goes here
		return false;
	}

}
