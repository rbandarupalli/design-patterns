package designpatterns.behavioral.observer;

import java.util.stream.Stream;

public class SMSObserver extends EmailObserver {

	public SMSObserver(ErrorLogSubject subject) {
		super(subject);
	}

	@Override
	protected void processChangeEvent() {
		// actual implementation that sends email alerts goes here
		System.out.println("SMS message sent for error logs: ");
		Stream.of(super.errorLogs).forEach(System.out::println);
	}

}
