package designpatterns.structural.flyweight;

import java.util.HashMap;

public class TextOnlyContent implements Page {

	
	public TextOnlyContent() {
		super();
		// initialization of intrinsic state goes here
	}

	@Override
	public String printPage(String[] content) {
		// TODO Auto-generated method stub
		return "Text only content processed and printed";
	}
	
	private void processAndDisplayContent(String[] content) {
		// process the request with support of the intrinsic state
	}
	
	
	
	private String fontName;
	private String fontSize;
	private int borderMargin;
	private int lineSpace;
	private HashMap<String, String> pageProcessorProperties;
	// other intrinsic state follows ...

}
