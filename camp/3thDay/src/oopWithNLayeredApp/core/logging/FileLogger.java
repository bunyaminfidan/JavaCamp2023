package oopWithNLayeredApp.core.logging;

public class FileLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("Logged file "+log);
	}

}
