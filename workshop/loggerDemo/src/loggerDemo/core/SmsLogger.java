package loggerDemo.core;

public class SmsLogger implements BaseLogger {

	@Override
	public void addLog(String message) {
		System.out.println("Logged to SmsLogger "+ message);
		
		
	}

}
