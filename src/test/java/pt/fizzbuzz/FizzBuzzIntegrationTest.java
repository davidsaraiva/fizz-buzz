package pt.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemErrRule;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.experimental.categories.Category;

import pt.fizzbuzz.category.IntegrationTest;
import pt.fizzbuzz.utils.SystemUtil;

@Category(IntegrationTest.class)
public class FizzBuzzIntegrationTest {
    
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
    
    @Rule
    public final SystemErrRule systemErrRule = new SystemErrRule().enableLog();
    
    @Test
    public void whenScriptRunsWithCorrectParamsTest() 
    {
    	final String EXPECTED_RESULT = "1 2 lucky 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz lucky 14 FizzBuzz 16 17 Fizz 19 Buzz";
    	
    	executeAppMain( new String[] {"1","20"} );
        
        assertEquals(EXPECTED_RESULT, SystemUtil.getValue(systemOutRule));
    }
    
    @Test
    public void whenScriptRunsWithInsuficientParamsTest() 
    {
        final String EXPECTED_RESULT = "ERROR: Invalid number of params, was expecting minimum range and maximum range";
        
        executeAppMain( new String[] {"1"} );
        
        assertEquals(EXPECTED_RESULT, SystemUtil.getValue(systemErrRule));
    }
    
    @Test
    public void whenScriptRunsWithSwitchedRangesTest() 
    {
        final String EXPECTED_RESULT = "ERROR: minimum range should be lower than maximum range";
        
        executeAppMain( new String[] {"20","1"} );
        
        assertEquals(EXPECTED_RESULT, SystemUtil.getValue(systemErrRule));
    }
    
    private void executeAppMain(String[] args)
    {
    	App.main(args);
    }
    
}
