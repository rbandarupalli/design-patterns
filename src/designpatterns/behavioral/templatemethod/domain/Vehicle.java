package designpatterns.behavioral.templatemethod.domain;

public interface Vehicle extends Cloneable {

	void prepareForDispatch();
	String getAcceptedFuelType();

}
