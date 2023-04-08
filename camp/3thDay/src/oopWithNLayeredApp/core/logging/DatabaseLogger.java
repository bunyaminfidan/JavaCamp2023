package oopWithNLayeredApp.core.logging;

public class DatabaseLogger  implements Logger{

	@Override
	public void log(String log) {
		System.out.println( "Logged database "+ log);
		
	}
	

}
