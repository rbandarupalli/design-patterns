package designpatterns.behavioral.state;

public class TiredDriver implements DriverState {

	@Override
	public String currentState(VehicleDriverContext context) {
		// actual implementation goes here.
		return "Tired driver";
	}

}
