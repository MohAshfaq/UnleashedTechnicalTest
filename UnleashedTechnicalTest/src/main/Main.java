package main;

import java.util.Scanner;

/**
 * 13th October 2021
 * @author Mohmed Ashfaq
 * Unleashed Interview
 * 
 * Main class used to run the program through command line.
 *
 */

public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);   
		System.out.print("Enter an input number ");  
		String input  = sc.next();
		sc.close();
	
		if (input == null || input.length() <= 0) {
			System.out.println("Invalid input");
			return;
		}
				
		
		try {
	        double number = Double.parseDouble(input);
	        String answer = ConvertNumericToEnglishCurrency.getEnglishCurrencyFromNumber(number);
			System.out.println("The word representation of the number is: " + answer);
	    } catch (NumberFormatException nfe) {
	    	System.out.println("Invalid input");
			return;
	    }		

	}

}

