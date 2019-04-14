package designpatterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract class declares all the methods to build parts applicable to all types of builder
 * subclassess.
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public abstract class Builder {
	
	public void fixAccessories() {
		this.addActionCompleted("Accessories added");
	}
	public void carryPaintJob() {
		this.addActionCompleted("Completed paint job");
	}
	public void installDoors() {
		this.addActionCompleted("Fixed doors");
	}
	public void qualityCheck() {
		this.addActionCompleted("Quality Check completed");
	}
	
	private void addActionCompleted(String action) {
		this.statesCompleted.add(action);
	}
	
	public String getCompletedActions() {
		return this.statesCompleted.toString();
	}
	
	private List<String> statesCompleted = new ArrayList<String>();
}
