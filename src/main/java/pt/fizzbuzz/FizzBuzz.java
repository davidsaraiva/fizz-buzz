package pt.fizzbuzz;

import static pt.fizzbuzz.utils.AppConstants.*;

public class FizzBuzz {
    
	/**
	 * Encodes a numeric value according to FizzBuzz rules:
	 * 
	 * encodeFizzBuzz(333) 	=> lucky
	 * encodeFizzBuzz(15) 	=> FizzBuzz
	 * encodeFizzBuzz(3) 	=> Fizz
	 * encodeFizzBuzz(5) 	=> Buzz
	 * encodeFizzBuzz(7) 	=> 7
	 * 
	 * @param number
	 * @return String with encoded result
	 */
    public String encodeFizzBuzz(int number) {
        if (containsLuckyNumber(number)) 
        {
            return LUCKY_RESULT;
        }
        
        StringBuilder result = new StringBuilder();
        
        if (isFizzNumber(number)) 
        {
            result.append(FIZZ_RESULT);
        }
        if (isBuzzNumber(number)) 
        {
            result.append(BUZZ_RESULT);
        }
        
        return result.length() == 0 ? String.valueOf(number) : result.toString();
    }
    
    /**
     * Verifies if argument contains the lucky number
     * 
     * containsLuckyNumber(333) => true
     * containsLuckyNumber(111) => false
     *  
     * @param number
     * @return true if contains the lucky number
     */
    private boolean containsLuckyNumber(int number)
    {
    	return String.valueOf(number).contains(LUCKY_NUMBER);
    }
    
    /**
     * Verifies if the argument is a match on Fizz rule
     * 
     * isFizzNumber(3) => true
     * isFizzNumber(2) => false
     * 
     * @param number
     * @return true if argument is a match for Fizz Rule
     */
    private boolean isFizzNumber(int number) 
    {
    	return isMultiple(number, FIZZ_MODULUS_FACTOR);
    }
    
    /**
     * Verifies if the argument is a match on Buzz rule
     * 
     * isBuzzNumber(5) => true
     * isBuzzNumber(2) => false
     * 
     * @param number
     * @return true if argument is a match for Buzz Rule
     */
    private boolean isBuzzNumber(int number) 
    {
    	return isMultiple(number, BUZZ_MODULUS_FACTOR);
    }
    
    /**
     * Verifies if numberToTest is multiple of multipleFactor
     * 
     * isMultiple(5,5) => true
     * isMultiple(7,5) => false
     * 
     * @param numberToTest
     * @param multipleFactor
     * @return true if numberToTest is multiple of multipleFactor
     */
    public boolean isMultiple(int numberToTest, int multipleFactor) 
    {
        return numberToTest % multipleFactor == IS_MULTIPLE_RESULT;
    }
}
