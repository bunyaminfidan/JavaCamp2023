package oopWithNLayeredApp.core.logging;

public class MailLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("Sended mail " + log);
	}

}
