package week_5_OOP;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please Enter your word");
		String word = kb.next();
		System.lineSeparator();
		
		AsteriskLogger logger1 = new AsteriskLogger(word);		
		
		//Just for visual clarity
		System.out.println(System.lineSeparator() + "AsteriskLogger: ");
		
		logger1.log(word);		
		
		logger1.error(word);
		
		SpacedLogger logger2 = new SpacedLogger(word);
		
		//Just for visual clarity
		System.out.println(System.lineSeparator() + "SpacedLogger: " + System.lineSeparator());
		
		logger2.log(word);
		
		logger2.error(word);
	}

}
