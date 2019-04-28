package designpatterns.behavioral.visitor;

/**
 * Carries additional operations on a data structure elements.
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public class DataElementsValidationVisitor implements Visitor {

	@Override
	public void visitStringElement(StringElement element) {
		if(element.getValue() == null || element.getValue().isEmpty()) {
			stringElementsWithEmptyValueCount++;
		} else {
			stringElementsWithValueCount++;
		}
	}

	@Override
	public void visitNumericElement(NumericElement element) {
		if(element.getValue() > 0) intElementsWithNonZeroValueCount++;
		else intElementsWithZeroValueCount++;
	}

	@Override
	public String toString() {
		return "DataElementsValidationVisitor [intElementsWithNonZeroValueCount=" + intElementsWithNonZeroValueCount
				+ System.getProperty("line.separator") + ", intElementsWithZeroValueCount=" + intElementsWithZeroValueCount
				+ System.getProperty("line.separator") + ", stringElementsWithEmptyValueCount=" + stringElementsWithEmptyValueCount
				+ System.getProperty("line.separator") + ", stringElementsWithValueCount=" + stringElementsWithValueCount + "]";
	}





	private int intElementsWithNonZeroValueCount = 0;
	private int intElementsWithZeroValueCount = 0;
	private int stringElementsWithEmptyValueCount = 0;
	private int stringElementsWithValueCount = 0;

}
