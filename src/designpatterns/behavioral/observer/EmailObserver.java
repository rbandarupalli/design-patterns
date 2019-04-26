package designpatterns.behavioral.observer;

import java.util.Random;
import java.util.stream.Stream;

public class EmailObserver implements Observer {

	public EmailObserver(Subject subject) {
		super();
		this.subject = subject;
		this.id = new Random().nextInt();
		this.subject.attach(this);
	}
	@Override
	public void refreshState() {
		this.errorLogs = subject.getState();
		processChangeEvent();
	}
	
	protected void processChangeEvent() {
		// actual implementation that sends email alerts goes here
		System.out.println("Email alert sent for error logs: ");
		Stream.of(this.errorLogs).forEach(System.out::println);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmailObserver other = (EmailObserver) obj;
		if (id != other.id)
			return false;
		return true;
	}

	protected String[] errorLogs;
	private Subject subject;
	private int id;
}
