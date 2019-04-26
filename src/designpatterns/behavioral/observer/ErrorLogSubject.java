package designpatterns.behavioral.observer;

public class ErrorLogSubject extends Subject {

	@Override
	public void setState(String[] errorLogs) {
		this.errorLogs = errorLogs;
		super.notifyObservers();
	}
	
	@Override
	public String[] getState() {
		return errorLogs.clone();
	}
	
	private String[] errorLogs;
}
