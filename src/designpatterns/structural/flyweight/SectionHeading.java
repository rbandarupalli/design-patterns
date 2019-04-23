package designpatterns.structural.flyweight;

public class SectionHeading extends MixedContent {

	public SectionHeading() {
		super();
		// initialization of intrinsic state goes here
	}

	@Override
	public String printPage(String[] content) {
		// actual implementation goes here
		return "Section heading content processed and printed";
	}
	
	private int[] sectionImagePosition;
	private int imageSize;
	// other intrinsic state follows ...
}
