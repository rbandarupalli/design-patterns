package designpatterns.behavioral.iterator;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Iterator pattern.
 * 
 * An array aggregate with forward and backward iterators support.
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 * @param <T>
 */
public class VehicleParts<T> implements Aggregate<T> {

	@Override
	public Iterator<T> forwardIterator() {
		return new ForwardIterator<>(this);
	}

	@Override
	public Iterator<T> backwardIterator() {
		return new BackwardIterator<>(this);
	}

	@Override
	public void addPart(T part) {
		if(parts == null) {
			synchronized (VehicleParts.class) {
				parts = (T[]) Stream.of(part).toArray();				
			}
			return;
		}
		int newLength = parts.length + 1;
		
		synchronized (VehicleParts.class) {
			parts = Arrays.copyOf(parts, newLength);
			parts[newLength - 1] = part;
		}
	}

	@Override
	public int size() {
		return parts == null ? 0 :  parts.length;
	}

	@Override
	public T getPart(int index) {
		return (T) parts[index];
	}

	private volatile T[] parts;
}
