package codingAssignments;

public class Week3CodingAssignment {

	public static void main(String[] args) {

		int [] ages= {3,9,23,64,2,8,28,93,60};				
		String [] names= {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		String sumNames = "";
		int sum = 0;		
		double [] a = {1.2,6.7,95.2};
		double [] b = {1.5,1.65,75.5};
		boolean isHotOutside = true;
		double moneyInPocket = 11.6;		
		boolean donut = true;
		int pinkSprinkle = 350;
		
		System.out.println("Question 1: " + (ages[ages.length-1] - ages[0]));
						
		for (int i=0; i < names.length; i++) {
			sumNames += names[i];
		}
			System.out.println("Question 2: " + sumNames.length() / names.length);
			
			System.out.println("Question 2b: ");
			for (String name : names) {
				System.out.print(name + " ");
			}			
			System.out.println(" ");
			
			int [] nameLengths = new int[names.length];
			
			for ( int i = 0; i < names.length; i++) {
				nameLengths[i] = names[i].length();

				System.out.println(nameLengths[i]);
			}
			
			for (int num : nameLengths) {				
				sum += nameLengths[num];
			}
			System.out.println("Question 6: " + sum);
			
			System.out.println(sumArray(ages));
			
			System.out.println("Avg arr: " + averageArray(a,b));
			
			System.out.println("willBuyDrink: " + willBuyDrink(isHotOutside, moneyInPocket));
			
			 System.out.println(donutRemainder(pinkSprinkle,donut));
			
			
	}
	
	public static String multiplyString(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += word;
		}
		return result;
	}
	

	public static String createFullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName; }
	
	public static String sumArray(int[] number) {
		int sum = 0;
		for (int i = 0; i < number.length; i++) {
			sum += number[i];
		}
		if (sum > 100) {
			return "true";
		} else {
			return "false";
		}
		}
	
		public static double calculateAverage(double[] numbers) {
			double sum = 0;
			for (double number : numbers) {
				sum += number;
			}
			return sum / numbers.length; 		
		}

		public static Boolean averageArray(double[] a, double[] b) {
			double sumA = 0.0;
			double sumB = 0.0;
			
			for (int i = 0; i < a.length; i++) {
			sumA += a[i];
			}
			for (int i = 0; i < b.length; i++) {
			sumB += b[i];
			}
			if ((sumA / a.length) > (sumB / b.length))
				return true;
			else
			return false;
		}
		
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			if (isHotOutside && (moneyInPocket > 10.50))
					return true;
			else
				return false;
		}
		
		public static int donutRemainder(int x, boolean y) {

			/*
			 * My current job is to make donuts, and the papers we use to know how many of something to make is an excel
			 * spreadsheet showing the amount of full trays, and the remainder left over.
			 * I've been thinking about ways to make the process of creating the spreadsheet easier, and how i would go about
			 * making a program to simplify the process of taking the orders and adding them to the numbers.
			 * 
			 * This method i would want to use when i have the final numbers and are making the final spreadsheets.
			 */
			
			System.out.println("Here is the amount of donuts you need:");
			if (y == true) {
				System.out.print((x / 24) + " Trays with remaining " );
				return x % 24;
			} else {
				System.out.print((x / 25) + "Trays with remaining ");
				return (x % 25);
			}
			
			
		}
		
		
} 
