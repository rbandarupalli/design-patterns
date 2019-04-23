package designpatterns.structural.flyweight;

import java.util.HashMap;

public class MixedContent implements Page {

	public MixedContent() {
		super();
		// initialization of intrinsic state goes here
	}

	@Override
	public String printPage(String[] content) {
		// actual implementation goes here
		return "Text and image content processed and printed";
	}

	private String fontName;
	private String fontSize;
	private int borderMargin;
	private int lineSpace;
	private HashMap<String, String> pageProcessorProperties;
	// other intrinsic state follows ...
}
