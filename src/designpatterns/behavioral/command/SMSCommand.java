package designpatterns.behavioral.command;

public class SMSCommand implements Command {

	public SMSCommand(SMSProcessor receiver, String message) {
		super();
		this.receiver = receiver;
		this.message = message;
	}

	@Override
	public void execute() {
		// invoke operations on the receiver.
		this.receiver.sendMessage(this.message);
	}
	
	private SMSProcessor receiver;
	private String message; 
}
