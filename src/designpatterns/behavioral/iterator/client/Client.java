package designpatterns.behavioral.iterator.client;

import designpatterns.behavioral.iterator.Iterator;
import designpatterns.behavioral.iterator.VehicleParts;

public class Client {

	public static void main(String[] args) {
		VehicleParts<String> parts = new VehicleParts<>();
		parts.addPart("part one");
		parts.addPart("part two");
		parts.addPart("part three");
		
		System.out.println("size: " + parts.size());
		System.out.println();
		System.out.println("Forward iterator output:");
		for(Iterator<String> forwardIter = parts.forwardIterator(); forwardIter.hasNext();) {
			System.out.println(forwardIter.next());
		}
		System.out.println();
		System.out.println("Backward iterator output:");
		for(Iterator<String> backwardIter = parts.backwardIterator(); backwardIter.hasNext();) {
			System.out.println(backwardIter.next());
		}
	}

}
