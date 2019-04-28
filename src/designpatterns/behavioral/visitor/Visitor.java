package designpatterns.behavioral.visitor;

public interface Visitor {
	void visitStringElement(StringElement element);
	void visitNumericElement(NumericElement element);
}
