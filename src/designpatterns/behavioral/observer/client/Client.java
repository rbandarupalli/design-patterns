package designpatterns.behavioral.observer.client;

import designpatterns.behavioral.observer.EmailObserver;
import designpatterns.behavioral.observer.ErrorLogSubject;
import designpatterns.behavioral.observer.Observer;
import designpatterns.behavioral.observer.SMSObserver;

/**
 * The Observer pattern.
 * 
 * Unlike Mediator where the emphasis is encapsulating
 * how objects communicate, the Observer notifies all observers.
 * 
 * @author Ramanjaneyulu B
 *
 */
public class Client {

	public static void main(String[] args) {

		String[] errorLogs = {"error log 1", "error log 2" };
		ErrorLogSubject subject = new ErrorLogSubject();
		// Initiate observers
		Observer smsObserver = new SMSObserver(subject);
		Observer emailObserver = new EmailObserver(subject);

		subject.setState(errorLogs);
		
		System.out.println();
		System.out.println("New error logs:");

		errorLogs = new String[]{"error log 3"};
		subject.setState(errorLogs);
	}

}
