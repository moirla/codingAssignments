package week_5_OOP;

public class AsteriskLogger implements Logger {

	private String word;
	
	
	public AsteriskLogger(String word) {
		this.word = word;
	}
	
	
	
	@Override
	public void log(String log) {		
		System.out.println("");
		System.out.println("***" + word + "***");
		System.out.println("");
	}

	@Override
	public void error(String error) {
		System.out.println("*****************"
				+ System.lineSeparator()
				
				+ "***Error: " + word + "***"
				
				+ System.lineSeparator()
				+ "*****************");
	}

	
}
