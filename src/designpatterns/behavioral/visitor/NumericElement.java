package designpatterns.behavioral.visitor;

import java.util.Random;

public class NumericElement implements Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitNumericElement(this);
	}
	
	public int getValue() {
		return value;
	}
	
	private static final Random r = new Random();
	private int value = r.nextInt(2);

}
