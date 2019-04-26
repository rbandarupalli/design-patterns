package designpatterns.behavioral.mediator;

public abstract class Participant {

	public void notifyMediator() {
		mediator.routeMessage(this);
	}
	
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	private Mediator mediator;
}
