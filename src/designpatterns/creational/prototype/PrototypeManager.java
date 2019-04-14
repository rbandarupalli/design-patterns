package designpatterns.creational.prototype;

import java.util.HashMap;

import designpatterns.creational.prototype.domain.Vehicle;
import designpatterns.creational.prototype.domain.impl.FourWheeler;
import designpatterns.creational.prototype.domain.impl.TwoWheeler;

public class PrototypeManager {

	public static PrototypeManager getInstance() {
		if(singleton == null) {
			synchronized (PrototypeManager.class) {
				if(singleton == null) {
					singleton = new PrototypeManager();
					singleton.init();
					System.out.println("Prototype manager initialized.");
					System.out.println();
				}
			}
		}
		
		return singleton;
	}
	
	public Vehicle getPrototype(String type) {
		return prototypes.get(type).createClone();
	}
	
	public void addPrototype(String type, Vehicle prototype) {
		// implement to dynamically add new prototypes
	}
	
	public void removePrototype(String type) {
		// implement to dynamically remove prototypes
	}
	
	private void init() {
		prototypes.put("twoWheeler", new TwoWheeler());
		prototypes.put("fourWheeler", new FourWheeler());
	}
	
	private HashMap<String, Vehicle> prototypes = new HashMap<>();
	
	// do not let others create objects of this class, we want to ensure only one object of this 
	// class is present in the system and that object is retrieved by calling getInstance 
	// static method.
	private PrototypeManager() {}
	private static volatile PrototypeManager singleton = null;
}

