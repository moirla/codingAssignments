package week_5_OOP;

public class SpacedLogger implements Logger {

	private String word;
	
	public SpacedLogger(String word) {
		this.word = word;
	}
	
	
	@Override
	public void log(String log) {
		
		for(int i = 0; i < word.length(); i++) {
			System.out.print(word.charAt(i) + " ");
		}
		System.out.println("");
	}

	@Override
	public void error(String error) {
		
		System.out.println("");
		System.out.print("ERROR: ");
				
		for(int i = 0; i < word.length(); i++) {
			System.out.print(word.charAt(i) + " ");
		}
		
	}

}
