package designpatterns.behavioral.command;

public class EmailCommand implements Command {

	public EmailCommand(EmailProcessor receiver, String message) {
		super();
		this.receiver = receiver;
		this.message = message;
	}
	@Override
	public void execute() {
		// invoke operations on the receiver.
		receiver.sendMessage(this.message);

	}

	private EmailProcessor receiver;
	private String message;
}
