package pt.fizzbuzz;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import pt.fizzbuzz.category.UnitTest;

@Category(UnitTest.class)
public class FizzBuzzUnitTest {
    
    private FizzBuzz fizzBuzz;
    private static final String SPACE = " ";
    
    @Before
    public void initializeTestVars() {
        setFizzBuzz(new FizzBuzz());
    }
    
    @Test
    public void testFizz() {
        
    	System.out.println("asdasdas");
    	
        final List<Integer> FIZZ_TEST_PARAMS = Arrays.asList(6,9,12,18,21);
        final String FIZZ_TEST_EXPECTED_RESULT = String.join(SPACE, 
                Collections.nCopies(FIZZ_TEST_PARAMS.size(), FizzBuzz.FizzBuzzRule.FIZZ.getRuleResult()));
        
        assertEquals("Expected result was " + FIZZ_TEST_EXPECTED_RESULT , FIZZ_TEST_EXPECTED_RESULT, executeFizzBuzz(FIZZ_TEST_PARAMS.stream()));
        
        
        /*final int iteratorStep = FizzBuzz.FizzBuzzRule.FIZZ.getRuleMultipleFactor();
        List<String> resultList = new ArrayList<String>();
        
        IntStream
            .iterate(iteratorStep, step -> step + iteratorStep)
            .limit(10)
            .forEach(number -> resultList.add(getFizzBuzz().encodeFizzBuzz(number)));
        
        
        String resultStr = String.join(SPACE, resultList);
        
        System.out.println(resultStr);*/
        
    }
    
    @Test
    public void testBuzz() {
        final List<Integer> BUZZ_TEST_PARAMS = Arrays.asList(5,10,20,25,35);
        final String BUZZ_TEST_EXPECTED_RESULT = String.join(SPACE, 
                Collections.nCopies(BUZZ_TEST_PARAMS.size(), FizzBuzz.FizzBuzzRule.BUZZ.getRuleResult()));
        
        assertEquals("Expected result was " + BUZZ_TEST_EXPECTED_RESULT , BUZZ_TEST_EXPECTED_RESULT, executeFizzBuzz(BUZZ_TEST_PARAMS.stream()));
    }
    
    @Test
    public void testFizzBuzz() {
        final List<Integer> FIZZ_BUZZ_TEST_PARAMS = Arrays.asList(5,10,20,25,35);
        final String FIZZ_BUZZ_TEST_EXPECTED_RESULT = String.join(SPACE, 
                Collections.nCopies(FIZZ_BUZZ_TEST_PARAMS.size(), FizzBuzz.FizzBuzzRule.FIZZ.getRuleResult() + FizzBuzz.FizzBuzzRule.BUZZ.getRuleResult()));
        
        assertEquals("Expected result was " + FIZZ_BUZZ_TEST_EXPECTED_RESULT , FIZZ_BUZZ_TEST_EXPECTED_RESULT, executeFizzBuzz(FIZZ_BUZZ_TEST_PARAMS.stream()));
        
        /*final int iteratorStep = FizzBuzz.FizzBuzzRule.FIZZ.getRuleMultipleFactor() * FizzBuzz.FizzBuzzRule.BUZZ.getRuleMultipleFactor();
        
        IntStream
            .iterate(iteratorStep, step -> step + iteratorStep)
            .limit(10)
            .forEach(this::callFizzBuzzEncode);*/
    }
    
    @Test
    public void testLucky() {
        final List<Integer> LUCKY_TEST_PARAMS = Arrays.asList(3,13,23,33,43);
        final String LUCKY_TEST_EXPECTED_RESULT = String.join(SPACE, 
                Collections.nCopies(LUCKY_TEST_PARAMS.size(), FizzBuzz.LUCKY_RESULT));
        
        assertEquals("Expected result was " + LUCKY_TEST_EXPECTED_RESULT , LUCKY_TEST_EXPECTED_RESULT, executeFizzBuzz(LUCKY_TEST_PARAMS.stream()));
    }
    
    private String executeFizzBuzz(Stream<Integer> stream) {
        List<String> resultList = new ArrayList<String>();
        stream.forEach(number -> resultList.add(getFizzBuzz().encodeFizzBuzz(number)));
        return String.join(SPACE, resultList);
    }
    
    public FizzBuzz getFizzBuzz() {
        return fizzBuzz;
    }

    public void setFizzBuzz(FizzBuzz fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
    }
}
