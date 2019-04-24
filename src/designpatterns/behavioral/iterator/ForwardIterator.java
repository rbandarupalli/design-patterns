package designpatterns.behavioral.iterator;

public class ForwardIterator<T> implements Iterator<T> {

	public ForwardIterator(Aggregate<T> aggregate) {
		super();
		this.aggregate = aggregate;
		this.currPos = this.aggregate.size() > 0 ? 0 : -1;
	}

	@Override
	public boolean hasNext() {
		return this.currPos >= 0 && this.currPos < this.aggregate.size();
	}

	@Override
	public T next() {
		return this.aggregate.getPart(currPos++);
	}

	private Aggregate<T> aggregate;
	private int currPos;
}
