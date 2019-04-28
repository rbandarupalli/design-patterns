package designpatterns.behavioral.visitor;

public class StringElement implements Element {

	public StringElement(String value) {
		super();
		this.value = value;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitStringElement(this);
	}
	
	public String getValue() {
		return this.value;
	}

	private String value;
}
