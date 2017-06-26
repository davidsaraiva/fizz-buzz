package pt.fizzbuzz;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import pt.fizzbuzz.category.IntegrationTest;

@Category(IntegrationTest.class)
public class FizzBuzzIntegrationTest {
    
    private FizzBuzz fizzBuzz;
    private static final String SPACE = " ";
    
    @Before
    public void initializeTestVars() {
        setFizzBuzz(new FizzBuzz());
    }
    
    @Test
    public void integrationTest() {
    	final String FULL_TEST_EXPECTED_RESULT = "asd 2 lucky 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz lucky 14 FizzBuzz 16 17 Fizz 19 Buzz";
        
        String resultStr = executeFizzBuzz(IntStream.rangeClosed(1, 20).boxed());
        
        assertThat(FULL_TEST_EXPECTED_RESULT, equalTo(resultStr));
        
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
