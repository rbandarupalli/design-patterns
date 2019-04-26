package designpatterns.behavioral.observer;

import java.util.HashSet;
import java.util.Set;

/**
 * The Observer pattern.
 * Any change in the subject state is notified to all the registered observers.  
 * 
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public abstract class Subject {
	
	public Subject() {
		super();
		this.observers = new HashSet<>();
	}

	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {
		observers.stream().forEach(o -> o.refreshState());
	}
	
	public abstract void setState(String[] errorLogs);
	
	public abstract String[] getState();
	
	private Set<Observer> observers;
}
