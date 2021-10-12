package main;

/**
 * 13th October 2021
 * @author Mohmed Ashfaq
 * Unleashed Interview
 *
 */

public class Main {

	public static void main(String[] args) {
	
		if (args[0] == null || args.length <= 0) {
			System.out.println("Invalid input");
			return;
		}
		
		
		try {
	        double number = Double.parseDouble(args[0]);
	        String answer = ConvertNumericToEnglishCurrency.getEnglishCurrencyFromNumber(number);
			System.out.println("The word representation of the number is: " + answer);
	    } catch (NumberFormatException nfe) {
	    	System.out.println("Invalid input");
			return;
	    }		

	}

}

