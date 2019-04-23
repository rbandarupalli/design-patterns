package designpatterns.structural.flyweight;

import java.util.HashMap;

/**
 * A flyweight factory, it is a singleton.
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public class FlyweightFactory {
	
	public static Page getFlyweight(String type) {
		Page flyweight = flyweights.get(type);
		if(flyweight == null) {
			synchronized (FlyweightFactory.class) {
				try {
					flyweight = (Page) Class.forName(type).newInstance();
					System.out.println("Flyweight factory created instance of type: " + type);
				} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
					// handle exception as appropriate
					e.printStackTrace();
				}
				flyweights.put(type, flyweight);
			}
		}
		
		return flyweight;
	}
	
	private static volatile HashMap<String, Page> flyweights = new HashMap<>();
}
