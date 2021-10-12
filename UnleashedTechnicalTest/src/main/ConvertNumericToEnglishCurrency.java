package main;

/**
 * 13th October 2021
 * @author Mohmed Ashfaq
 * Unleashed Interview
 *
 */

public class ConvertNumericToEnglishCurrency {

	public static String[] ones = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
			"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };

	public static String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
	
	public static final String INVALID_INPUT = "Invalid input";
	public static final String INVALID_INPUT_ONLY_POSITIVE = "Number can not be less than 0";

	
	public static String getEnglishCurrencyFromNumber(double number) { 
		
		//fast fail
		if (number == Double.valueOf(0))
			return "Zero";
		
		//fast fail
		if (number < 0) 
			return INVALID_INPUT_ONLY_POSITIVE;

		String dollarsPart = "";
	    String centsPart = "";
		
	    //10.6 becomes 10
	    long dollars = (long) (number); 
	    //10.6 - 10 = 0.6, 0.6 * 100 = 60. Hence cents become 60 cents
	    long cents = Math.round((number - dollars) * 100); 
	   
	    if (dollars > 0) {
	        dollarsPart = convert(dollars);
	        if (dollars > 1)
	        	dollarsPart += " Dollars";
	        else
	        	dollarsPart += " Dollar";

	    }
	    if (cents > 0) {
	        if (dollarsPart.length() > 0) {
	            centsPart = " And ";
	        }
	        centsPart += convert(cents);
	        if (cents > 1)
	        	centsPart += " Cents";
	        else 
				centsPart += " Cent";
			
	    }
	    return dollarsPart + centsPart;
	}



	private static String convert(long number) {
		//if number less than 20 we just display from string array equivalent
		if (number < 20) {
			return ones[(int) number];
		}

		//if number less than 100 we then break it in 2 parts. Example: 99 ninety nine
		else if (number < 100) {
			int remainder = (int) (number % 10);
			int firstPartint = Math.round((number - remainder) / 10);
			String firstPart = tens[firstPartint];

			if (remainder > 0)
				firstPart += " ";

			String secondPart = ones[remainder];
			return firstPart + secondPart;

		}

		//Use recursive method for numbers greater than 99
		//100 one hundred to 999.999 nine hundred and ninety nine
		else if (number < 1000) { 
			int remainder = (int) (number % 100);
			int firstPartint = Math.round((number - remainder) / 100);
			String firstPart = ones[firstPartint] + " Hundred";

			if (remainder > 0)
				firstPart += " ";

			String secondPart = convert(remainder);

			return firstPart + secondPart;

		}

		else if (number < 1_000_000) { // one thousand - nine thousand nine hundred ninety nine
			int remainder = (int) (number % 1000);
			String firstPart = convert(number / 1000) + " Thousand";

			if (remainder > 0)
				firstPart += " ";

			String secondPart = convert(remainder);

			return firstPart + secondPart;
		}

		else if (number < 1_000_000_000) {
			int remainder = (int) (number % 1_000_000);
			String firstPart = convert(number / 1_000_000) + " Million";

			if (remainder > 0)
				firstPart += " ";

			String secondPart = convert(remainder);

			return firstPart + secondPart;
		}
		else {
			int remainder = (int) (number % 1_000_000_000);
			String firstPart = convert(number / 1_000_000_000) + " Billion";

			if (remainder > 0)
				firstPart += " ";

			String secondPart = convert(remainder);

			return firstPart + secondPart;
			
		}

		
	}

}
