package designpatterns.behavioral.iterator;

public class BackwardIterator<T> implements Iterator<T> {

	public BackwardIterator(Aggregate<T> aggregate) {
		super();
		this.aggregate = aggregate;
		this.currPos = this.aggregate.size();
	}

	@Override
	public boolean hasNext() {
		return this.currPos > 0;
	}

	@Override
	public T next() {
		return this.aggregate.getPart(--currPos);
	}
	
	private Aggregate<T> aggregate;
	private int currPos;
}
