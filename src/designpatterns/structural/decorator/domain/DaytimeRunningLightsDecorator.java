package designpatterns.structural.decorator.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DaytimeRunningLightsDecorator implements VehicleI {
	VehicleI source = null;
	
	
	public DaytimeRunningLightsDecorator(VehicleI source) {
		super();
		this.source = source;
	}

	@Override
	public List<String> getCapabilities() {
		List<String> capabilities = new ArrayList<>();
		capabilities.add(
				"Day time running lights fitted");
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
