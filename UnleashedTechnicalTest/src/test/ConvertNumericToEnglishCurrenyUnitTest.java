package test;
import main.ConvertNumericToEnglishCurrency;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 13th October 2021
 * @author Mohmed Ashfaq
 * Unleashed Interview
 * 
 * Unit test covering a range of possible inputs. 
 *
 */

public class ConvertNumericToEnglishCurrenyUnitTest {
	
	  	@Test
	    public void negativeInput() {
	        assertEquals(ConvertNumericToEnglishCurrency.INVALID_INPUT_ONLY_POSITIVE, ConvertNumericToEnglishCurrency.getEnglishCurrencyFromNumber(-5));
	    }

	    @Test
	    public void zeroInput() {
	        assertEquals("Zero", ConvertNumericToEnglishCurrency.getEnglishCurrencyFromNumber(0));
	    }

	    @Test
	    public void oneDollarInput() {
	        assertEquals("One Dollar", ConvertNumericToEnglishCurrency.getEnglishCurrencyFromNumber(1));
	    }
	    
	    @Test
	    public void oneCentInput() {
	        assertEquals("One Cent", ConvertNumericToEnglishCurrency.getEnglishCurrencyFromNumber(0.01));
	    }

	    @Test
	    public void fiftyCentsInput() {
	        assertEquals("Fifty Cents", ConvertNumericToEnglishCurrency.getEnglishCurrencyFromNumber(0.5));
	    }
	    
	    @Test
	    public void fiveCentsInput() {
	        assertEquals("Five Cents", ConvertNumericToEnglishCurrency.getEnglishCurrencyFromNumber(0.05));
	    }

	    @Test
	    public void ninetyNineCentsInput() {
	        assertEquals("Ninety Nine Cents", ConvertNumericToEnglishCurrency.getEnglishCurrencyFromNumber(0.99));
	    }
	    
	    @Test
	    public void dollarAndSomeCentsInput() {
	        assertEquals("Five Dollars And Seventy Four Cents", ConvertNumericToEnglishCurrency.getEnglishCurrencyFromNumber(5.74));
	    }
	    
	    @Test
	    public void fiveHundredInput() {
	        assertEquals("Nine Hundred Dollars", ConvertNumericToEnglishCurrency.getEnglishCurrencyFromNumber(900));
	    }
	    
	    @Test
	    public void thousandsInput() {
	        assertEquals("Five Thousand Dollars", ConvertNumericToEnglishCurrency.getEnglishCurrencyFromNumber(5000));
	    }

	    
		@Test
		public void oneLessThanMillionInput() {
			assertEquals("Nine Hundred Ninety Nine Thousand Nine Hundred Ninety Nine Dollars",
					ConvertNumericToEnglishCurrency.getEnglishCurrencyFromNumber(999_999));
		}
	    
	    @Test
		public void oneLessThanBillionInput() {
			assertEquals("Nine Hundred Ninety Nine Million Nine Hundred Ninety Nine Thousand Nine Hundred Ninety Nine Dollars And Ninety Nine Cents",
					ConvertNumericToEnglishCurrency.getEnglishCurrencyFromNumber(999999999.99));
		}
	    
	    @Test
  		public void billionInput() {
  			assertEquals("One Billion Dollars",
  					ConvertNumericToEnglishCurrency.getEnglishCurrencyFromNumber(1000000000));
  		}
	    
	    @Test
  		public void billionAndSomethingInput() {
  			assertEquals("One Billion One Hundred Eleven Million One Hundred Eleven Thousand One Hundred Eleven Dollars",
  					ConvertNumericToEnglishCurrency.getEnglishCurrencyFromNumber(1111111111));
  		}
	   

}
