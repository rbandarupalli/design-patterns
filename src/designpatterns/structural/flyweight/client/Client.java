package designpatterns.structural.flyweight.client;

import java.util.ArrayList;
import java.util.List;

import designpatterns.structural.flyweight.FlyweightFactory;
import designpatterns.structural.flyweight.Page;

/**
 * Create only one object and reuse it whenever required via FlyweightFactory. The state 
 * that should be operated upon will be sent as method parameters. Beneficial when extrinsic 
 * state take less memory than would it be if it was represented in desired object form, and
 * when creating new objects have initialization overhead.
 * 
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public class Client {

	public static void main(String[] args) throws ClassNotFoundException {
		printBook();
	}
	
	private static void printBook() {
		List<String> book = new ArrayList<>();
		for(Record r : getDataset()) {
			Page p = FlyweightFactory.getFlyweight(r.pageType.getPageClass());
			book.add(p.printPage(r.content));
		}
		
		System.out.println();
		System.out.println("The Page objects are shared/reused to build pages in the book");
		System.out.println("No. of pages in the Book: " + book.size());
	}
	
	private static List<Record> getDataset() {
		List<Record> dataset = retrieveContentFromDatabaseOrFromOtherSource();
		return dataset;
	}
	
	private static List<Record> retrieveContentFromDatabaseOrFromOtherSource() {
		List<Record> dataset = new ArrayList<>();
		dataset.add(buildMixedContent(1));
		
		for(int j=2; j<100; j++) {
			dataset.add(buildTextOnlyContent(j));
		}
		dataset.add(buildSectionHeader(100));
		for(int j=101; j<200; j++) {
			dataset.add(buildTextOnlyContent(j));
		}
		dataset.add(buildMixedContent(200));

		return dataset;
	}

	private static Record buildMixedContent(int pageNumber) {
		Record r = new Record();
		r.pageType = PageType.MIXED_CONTENT;
		r.content = new String[1];
		r.content[0] = "This is mixed content for page number:" + pageNumber;
		return r;
	}

	private static Record buildTextOnlyContent(int pageNumber) {
		Record r = new Record();
		r.pageType = PageType.TEXT_CONTENT;
		r.content = new String[1];
		r.content[0] = "This is TEXT-ONLY content for page number:" + pageNumber;
		return r;
	}

	private static Record buildSectionHeader(int pageNumber) {
		Record r = new Record();
		r.pageType = PageType.SECTION_HEADER;
		r.content = new String[1];
		r.content[0] = "This is section header for page number:" + pageNumber;
		return r;
	}
	private static class Record {
		PageType pageType;
		String[] content;
	}
	
	private enum PageType {
		TEXT_CONTENT("designpatterns.structural.flyweight.TextOnlyContent") ,
		MIXED_CONTENT ("designpatterns.structural.flyweight.MixedContent"),
		SECTION_HEADER ("designpatterns.structural.flyweight.SectionHeading");
		
		public String getPageClass() {
			return this.pageClass;
		}
		
		PageType(String pageClass) {
			this.pageClass = pageClass;
		}
		String pageClass;
	}

}
