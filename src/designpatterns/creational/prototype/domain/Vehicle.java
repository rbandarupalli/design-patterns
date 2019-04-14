package designpatterns.creational.prototype.domain;

public interface Vehicle extends Cloneable {

	void prepareForDispatch();
	String getAcceptedFuelType();

	Vehicle createClone();
}
