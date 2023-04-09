package loggerDemo.core;

public class FileLogger implements BaseLogger {

	@Override
	public void addLog(String message) {
		System.out.println("Logged to FileLogger "+ message);
		
		
	}

}
