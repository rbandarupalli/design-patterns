package designpatterns.creational.builder;

/**
 * Gradually construct an object in a phased fashion. Kind of object created depends upon the 
 * builder constructor parameter.
 * 
 * @author Ramanjaneyulu B
 *
 */
public class Director {
	Builder builder = null;
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	// same construction process creates different representations based on the builder
	public void construct() {
		builder.installDoors();
		builder.carryPaintJob();
		builder.fixAccessories();
		builder.qualityCheck();
	}
	
}
