package pt.fizzbuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import org.apache.commons.lang3.StringUtils;

import static pt.fizzbuzz.utils.AppConstants.*;

public class App {

    private App(){}
    
    /**
     * The method receives two parameters, minimum range and maximum range. 
     * The program will at first hand validate the input parameters
     * and then each element in the range will be encoded with fizz buzz rules 
     * 
     * !Important This method expects to receive two parameters parameter.
     *       
     * @param args
     */
    public static void main(String[] args) 
    {
        if(invalidParams(args)){
            return;
        }
        
        FizzBuzz fizzBuzz = new FizzBuzz();
        
        int minRange = Integer.parseInt(args[0]);
        int maxRange = Integer.parseInt(args[1]);
        
        List<String> resultList = new ArrayList<>();
        
        IntStream
            .rangeClosed(minRange, maxRange)
            .forEach(number -> resultList.add(fizzBuzz.encodeFizzBuzz(number)));
        
        System.out.println(String.join(StringUtils.SPACE, resultList));
    }
    
    /**
     * Checks if the parameters are invalid
     * Invalid conditions:
     * Insufficient parameters
     * Not numeric parameters
     * minRange > maxRange
     * 
     * @param args
     * @return true if parameters are invalid
     */
    private static boolean invalidParams(String[] args) 
    {
        if( args == null || args.length < 2){
            System.err.println(ERROR_MSG_INVALID_NUMBER_OF_PARAMS);
            return true;
        }
        
        String minRangeStr = args[0];
        
        if(!StringUtils.isNumeric(minRangeStr)){
            System.err.println(ERROR_MSG_INVALID_MINIMUM_RANGE);
            return true;
        }
        
        String maxRangeStr = args[1];
        
        if(!StringUtils.isNumeric(maxRangeStr)){
            System.err.println(ERROR_MSG_INVALID_MAXIMUM_RANGE);
            return true;
        }
        
        
        int minRange = Integer.parseInt(minRangeStr);
        int maxRange = Integer.parseInt(maxRangeStr);
        
        if (minRange > maxRange) {
            System.err.println(ERROR_MSG_MAXIMUM_RANGE_GREATER_THAN_MINIMUM);
            return true;
        }
        
        return false;
    }
    
}
