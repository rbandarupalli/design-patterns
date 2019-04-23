package designpatterns.structural.composite.client;

import designpatterns.structural.composite.Dealer;
import designpatterns.structural.composite.DistributionNetwork;
import designpatterns.structural.composite.Distributor;

/**
 * Use composite pattern to build hierarchical tree like object structures and when 
 * you want to treat both composite structures and leaf objects amicably.
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public class Client {

	public static void main(String[] args) {

		DistributionNetwork composite = buildComposite();
		System.out.println(composite.checkAvailability("car"));
		System.out.println(composite.getDealerNetwork());
				
		DistributionNetwork leaf = new Dealer();
		composite = leaf;   // no distinction between leaf and composite
		System.out.println(composite.checkAvailability("car"));
		System.out.println(composite.getDealerNetwork());
		
	}

	private static DistributionNetwork buildComposite() {
		DistributionNetwork distributor = new Distributor();
		
		DistributionNetwork dealer = new Dealer();
		distributor.addToNetwork(dealer);

		dealer = new Dealer();
		distributor.addToNetwork(dealer);
		
		DistributionNetwork subDistributor = new Distributor();
		distributor.addToNetwork(subDistributor);

		dealer = new Dealer();
		subDistributor.addToNetwork(dealer);
		
		return distributor;
	}

}
