package designpatterns.behavioral.memento.client;

import java.util.ArrayList;
import java.util.List;

import designpatterns.behavioral.memento.Memento;
import designpatterns.behavioral.memento.Originator;

/**
 * The Memento pattern.
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public class Client {

	private static List<Memento> originatorMementoes = new ArrayList<>();
	
	public static void main(String[] args) {

		Originator o = new Originator();
		System.out.println("State changing operations sequence:");
		
		// loop 5 times to change the originator state
		int i = 0;
		while(i < 5) {
			o.stateChangingOperation();
			System.out.println(o.toString());
			originatorMementoes.add(o.createMemento());
			i++;
		}
		
		System.out.println();
		System.out.println("Mementoes saved: " + originatorMementoes.size());
		System.out.println();
		
		System.out.println("Undo operations sequence: ");
		i = 0;
		while(i < 5) {
			o.setMemento(undo());
			System.out.println(o.toString());
			i++;
		}
	}
	
	private static Memento undo() {
		return originatorMementoes.remove(originatorMementoes.size()-1);
	}

}
