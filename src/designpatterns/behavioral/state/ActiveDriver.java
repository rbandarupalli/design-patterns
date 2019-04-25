package designpatterns.behavioral.state;

public class ActiveDriver implements DriverState {

	@Override
	public String currentState(VehicleDriverContext context) {
		// actual implementation goes here.
		return "Active driver";
	}

}
