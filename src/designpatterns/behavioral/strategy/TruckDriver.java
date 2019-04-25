package designpatterns.behavioral.strategy;

public class TruckDriver implements Driver {

	@Override
	public String drive(String context) {
		// actual implementation goes here
		return "A truck driver.";
	}

}
