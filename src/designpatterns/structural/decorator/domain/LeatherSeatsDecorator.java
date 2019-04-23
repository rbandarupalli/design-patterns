package designpatterns.structural.decorator.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeatherSeatsDecorator implements VehicleI {
	VehicleI source = null;
	
	
	public LeatherSeatsDecorator(VehicleI source) {
		super();
		this.source = source;
	}

	@Override
	public List<String> getCapabilities() {
		List<String> capabilities = new ArrayList<>();
		capabilities.add(
				"Leather seats fitted");
		capabilities.addAll(this.source.getCapabilities());

		return capabilities;
	}

	@Override
	public void otherFunctionality() {
		// add customized features here if required
		
		// invoke the function on source
		this.source.otherFunctionality();
		
		// add some other customized features here if required

	}

}
