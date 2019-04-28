package designpatterns.behavioral.visitor.client;

import java.util.stream.Stream;

import designpatterns.behavioral.visitor.DataElementsValidationVisitor;
import designpatterns.behavioral.visitor.Element;
import designpatterns.behavioral.visitor.NumericElement;
import designpatterns.behavioral.visitor.StringElement;
import designpatterns.behavioral.visitor.Visitor;

/**
 * The Visitor pattern.
 * 
 * Use when you frequently require to carry additional operations on existing structure elements. 
 * Visitor allows additional operations on elements without modifying them.  
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public class Client {

	public static void main(String[] args) {
		Element[] elements = {new StringElement("test"), new StringElement(null),
				new NumericElement(), new NumericElement(), new NumericElement()};
		
		Visitor visitor = new DataElementsValidationVisitor();

		// while traversing the structure perform additional operations by accepting a visitor.
		Stream.of(elements).forEach(e -> {
			// actual implementation goes here 
			
			// perform additional operation on the element
			e.accept(visitor);
			
		});
		
		// print validation results
		System.out.println(visitor.toString());
	}
	
}
