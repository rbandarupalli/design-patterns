package designpatterns.behavioral.state;

/**
 * A Context equivalent class depicted in the book.
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public class VehicleDriverContext {
	
	
	public VehicleDriverContext(int drivingTimeHoursElapsed) {
		super();
		this.setDrivingTimeHoursElapsed(drivingTimeHoursElapsed);

	}
	
	public String drive() {
		// implementation based on the state goes here
		return this.driverState.currentState(this);
	}
	
	
	
	public int getDrivingTimeHoursElapsed() {
		return drivingTimeHoursElapsed;
	}

	public void setDrivingTimeHoursElapsed(int drivingTimeHoursElapsed) {
		this.drivingTimeHoursElapsed = drivingTimeHoursElapsed;
		this.setDriverState();
	}

	private void setDriverState() {
		if(this.drivingTimeHoursElapsed < 5) {
			this.driverState = new ActiveDriver();
		} else {
			this.driverState = new TiredDriver();
		}
	}


	private int drivingTimeHoursElapsed;
	private DriverState driverState;
}
