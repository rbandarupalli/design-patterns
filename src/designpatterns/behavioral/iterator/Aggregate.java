package designpatterns.behavioral.iterator;

public interface Aggregate<T> {
	public Iterator<T> forwardIterator();
	public Iterator<T> backwardIterator();
	public void addPart(T part);
	public int size();
	public T getPart(int index);
}
