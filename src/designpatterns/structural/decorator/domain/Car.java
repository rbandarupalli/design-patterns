package designpatterns.structural.decorator.domain;

import java.util.Arrays;
import java.util.List;

public class Car implements VehicleI {

	@Override
	public List<String> getCapabilities() {
		return Arrays.asList("Base car features");
	}

	@Override
	public void otherFunctionality() {
		// add features specific to car

	}

}
