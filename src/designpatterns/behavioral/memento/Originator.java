package designpatterns.behavioral.memento;

import java.util.Random;

public class Originator {

	public Memento createMemento() {
		return new OriginatorState();
	}
	
	public void setMemento(Memento memento) {
		OriginatorState state = (OriginatorState) memento;
		this.id = state.mementoId;
		this.name = state.mementoName;
	}

	public void stateChangingOperation() {
		id = r.nextInt(100);
		name = name + " " + r.nextInt(10);
	}
	
	@Override
	public String toString() {
		return "Originator [id=" + id + ", name=" + name + "]";
	}
	
	/**
	 * This private class OriginatorState acts as a wide interface to Memento, it's not 
	 * accessible outside this class.
	 *
	 */
	private class OriginatorState implements Memento {
		private int mementoId = id;
		private String mementoName = name;
	}
	
	private Random r = new Random();
	private int id = r.nextInt(100);
	private String name = "Name Info";
}
