package designpatterns.behavioral.strategy;

public class CityDriver implements Driver {

	@Override
	public String drive(String context) {
		// actual implementation goes here
		return "A city cab driver.";
	}

}
