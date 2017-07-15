package pt.fizzbuzz.utils;

import org.apache.commons.lang3.StringUtils;

public class AppConstants {
    
    // Fizz Buzz Rules
    public static final String  FIZZ_RESULT             = "fizz";
    public static final int     FIZZ_MODULUS_FACTOR     = 3;
    public static final String  BUZZ_RESULT             = "buzz";
    public static final int     BUZZ_MODULUS_FACTOR     = 5;
    public static final String  LUCKY_RESULT            = "lucky";
    public static final String  LUCKY_NUMBER            = "3";
    public static final String  INTEGER_RESULT          = "integer";
    
    // Error Messages
    public static final String ERROR_MSG_INVALID_NUMBER_OF_PARAMS            = "ERROR: Invalid number of params, was expecting minimum range and maximum range";
    public static final String ERROR_MSG_INVALID_MINIMUM_RANGE               = "ERROR: minimum range parameter is invalid";
    public static final String ERROR_MSG_INVALID_MAXIMUM_RANGE               = "ERROR: maximum range parameter is invalid";
    public static final String ERROR_MSG_MAXIMUM_RANGE_GREATER_THAN_MINIMUM  = "ERROR: minimum range should be lower than maximum range";
    
    // Others
    public static final String  SPACE                   = StringUtils.SPACE;
    public static final String 	BREAK_LINE_EXPRESSION   = "(\\r|\\n)";
    public static final String  RESULTS_SEPARATOR       = ":" + SPACE;
    public static final int 	IS_MULTIPLE_RESULT      = 0;
    public static final int     COUNTER_INITIAL_VALUE   = 0;
    
}