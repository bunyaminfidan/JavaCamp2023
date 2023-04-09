package loggerDemo.core;

public class EmailLogger implements BaseLogger {

	@Override
	public void addLog(String message) {
		System.out.println("Logged to EmailLogger "+ message);
		
		
	}

}
