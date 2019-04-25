package designpatterns.behavioral.strategy;

/**
 * A strategy pattern.
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public class VehicleDriverContext {

	public VehicleDriverContext(Driver driver, String context) {
		super();
		this.driver = driver;
	}

	public String drive() {
		// Based on the context client decides which strategy class to use.
		String s = driver.drive(this.localStateContext);
		return s;
	}

	private String localStateContext;
	private Driver driver;
}
