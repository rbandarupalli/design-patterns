package designpatterns.behavioral.command.client;

import designpatterns.behavioral.command.Command;
import designpatterns.behavioral.command.EmailCommand;
import designpatterns.behavioral.command.EmailProcessor;
import designpatterns.behavioral.command.SMSCommand;
import designpatterns.behavioral.command.SMSProcessor;

/**
 * The Command pattern.
 * 
 * Client doesn't know how to process a request but knows how to submit a request to a 
 * receiver who can process it.
 * 
 * @author Ramanjaneyulu Bandarupalli
 *
 */
public class Client {

	public static void main(String[] args) {
		EmailProcessor emailProcessor = new EmailProcessor();
		SMSProcessor smsProcessor = new SMSProcessor();
		String message = "test message";
		
		Command emailCommand = new EmailCommand(emailProcessor, message);
		Command smsCommand = new SMSCommand(smsProcessor, message);
		
		/*
		 * These commands can now be passed to a command queue processor or invoker for later 
		 * execution. 
		 * 
		 * Or the client itself can invoke the request.
		 */
		emailCommand.execute();
		smsCommand.execute();
	}

}
