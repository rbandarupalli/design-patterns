package designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * A composite.
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public class Distributor extends DistributionNetwork{

	public Distributor() {
		super();
		super.network = new ArrayList<>();
	}
	
	public Distributor(List<DistributionNetwork> network) {
		super();
		super.network.addAll(network);
	}
	
	@Override
	public boolean checkAvailability(String carModel) {
		for(DistributionNetwork dNetwork : super.getDealerNetwork()) {
			if(dNetwork.checkAvailability(carModel)) return true;
		}
		return false;
	}

}
