package designpatterns.structural.composite;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public abstract class DistributionNetwork {

	public abstract boolean checkAvailability(String carModel);
	
	public void addToNetwork(DistributionNetwork dNetwork) {
		if(network == null) return;
			network.add(dNetwork);
			dNetwork.setParent(this);
	}
	
	public DistributionNetwork getParent() {
		return this.parent;
	}

	public void removeFromNetwork(DistributionNetwork dNetwork) {
		if(network == null) return;
		network.remove(dNetwork);
	}
	
	public List<DistributionNetwork> getDealerNetwork() {
		if(network == null) return null;
		return Arrays.asList(network.toArray(new DistributionNetwork[0]));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (random ^ (random >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DistributionNetwork other = (DistributionNetwork) obj;
		if (random != other.random)
			return false;
		return true;
	}

	private void setParent(DistributionNetwork dealerNetwork) {
		this.parent = dealerNetwork;
	}

	protected List<DistributionNetwork> network = null;
	private DistributionNetwork parent = null;
	private long random = (new Random()).nextLong();
}
