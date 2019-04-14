package designpatterns.creational.prototype.client;

import designpatterns.creational.prototype.PrototypeManager;
import designpatterns.creational.prototype.domain.Vehicle;

public class Client {

	public static void main(String[] args) {
		PrototypeManager protypeManager = PrototypeManager.getInstance();
		
		System.out.println();
		
		System.out.println("creating objects by cloning existing one, notice, the constructors are not invoked.");
		Vehicle twoWheeler = protypeManager.getPrototype("twoWheeler");
		Vehicle fourWheeler = protypeManager.getPrototype("fourWheeler");
		
		System.out.println();
		twoWheeler.prepareForDispatch();
		fourWheeler.prepareForDispatch();
	}

}
