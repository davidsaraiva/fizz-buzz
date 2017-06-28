package pt.fizzbuzz.utils;

import static pt.fizzbuzz.utils.AppConstants.*;

public class FizzBuzzElementsCounter {

    private int fizzCounter     = COUNTER_INITIAL_VALUE;
    private int buzzCounter     = COUNTER_INITIAL_VALUE;
    private int fizzBuzzCounter = COUNTER_INITIAL_VALUE;
    private int luckyCounter    = COUNTER_INITIAL_VALUE;
    private int integerCounter  = COUNTER_INITIAL_VALUE;
    
    public void incrementCounter(String result)
    {
        switch (result) 
        {
            case FIZZ_RESULT:               fizzCounter++;      break;
            case BUZZ_RESULT:               buzzCounter++;      break;
            case FIZZ_RESULT + BUZZ_RESULT: fizzBuzzCounter++;  break;
            case LUCKY_RESULT:              luckyCounter++;     break;
            default:                        integerCounter++;   break;
        }
    }
    
    public String generateCounterString()
    {
        StringBuilder resultBuilder = new StringBuilder();
        appendCounterResult(resultBuilder, FIZZ_RESULT, fizzCounter);
        appendCounterResult(resultBuilder, BUZZ_RESULT, buzzCounter);
        appendCounterResult(resultBuilder, FIZZ_RESULT + BUZZ_RESULT, fizzBuzzCounter);
        appendCounterResult(resultBuilder, LUCKY_RESULT, luckyCounter);
        appendCounterResult(resultBuilder, INTEGER_RESULT, integerCounter);
        return resultBuilder.toString().trim();
    }
    
    private void appendCounterResult(StringBuilder resultBuilder, String counterName, int counterResult) 
    {
        resultBuilder.append(counterName).append(RESULTS_SEPARATOR).append(counterResult).append(SPACE);
    }
    
}
