package pt.fizzbuzz;

import static org.junit.Assert.assertEquals;
import static pt.fizzbuzz.utils.AppConstants.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import pt.fizzbuzz.category.UnitTest;
import pt.fizzbuzz.utils.AppConstants;

@Category(UnitTest.class)
public class FizzBuzzUnitTest {
    
    private FizzBuzz fizzBuzz;
    
    @Before
    public void initializeTestVars() 
    {
        this.fizzBuzz = new FizzBuzz();
    }
    
    @Test
    public void fizzSequencesTest() 
    {
        final List<Integer> FIZZ_TEST_PARAMS = Arrays.asList(6,9,12,18,21);
        executeTestForNElements(FIZZ_TEST_PARAMS, FIZZ_RESULT);
    }
    
    @Test
    public void buzzSequenceTest() 
    {
        final List<Integer> BUZZ_TEST_PARAMS = Arrays.asList(5,10,20,25,40);
        executeTestForNElements(BUZZ_TEST_PARAMS, BUZZ_RESULT);
    }
    
    @Test
    public void fizzBuzzSequenceTest() 
    {
        final List<Integer> FIZZ_BUZZ_TEST_PARAMS = Arrays.asList(15,45,60,75);
        executeTestForNElements(FIZZ_BUZZ_TEST_PARAMS, FIZZ_RESULT + BUZZ_RESULT);
    }
    
    @Test
    public void luckySequenceTest() 
    {
        final List<Integer> LUCKY_TEST_PARAMS = Arrays.asList(3,13,23,33,43);
        executeTestForNElements(LUCKY_TEST_PARAMS, LUCKY_RESULT);
    }
    
    @Test
    public void constantBuzzTest() 
    {
        assertEquals("buzz", AppConstants.BUZZ_RESULT);
    }
    
    private void executeTestForNElements(List<Integer> numbers, String expectedResultForEachPosition) 
    {
        final String EXPECTED_RESULT = buildExpectedResults(numbers.size(), expectedResultForEachPosition);
        assertEquals(EXPECTED_RESULT, executeFizzBuzzEncoding(numbers.stream()));
    }
    
    private String executeFizzBuzzEncoding(Stream<Integer> stream) 
    {
        List<String> resultList = new ArrayList<String>();
        stream.forEach(number -> resultList.add(fizzBuzz.encodeFizzBuzz(number)));
        return String.join(SPACE, resultList);
    }
    
    private String buildExpectedResults(int resultElementsSize, String resultText) 
    {
        return String.join(
                 SPACE
                ,Collections.nCopies(resultElementsSize, resultText));
    }
    
}
