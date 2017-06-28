package pt.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemErrRule;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.experimental.categories.Category;

import pt.fizzbuzz.category.IntegrationTest;
import pt.fizzbuzz.utils.SystemUtil;

import static pt.fizzbuzz.utils.AppConstants.*;

@Category(IntegrationTest.class)
public class FizzBuzzIntegrationTest {
    
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
    
    @Rule
    public final SystemErrRule systemErrRule = new SystemErrRule().enableLog();
    
    @Test
    public void whenScriptRunsWithCorrectParamsTest() 
    {
    	final String EXPECTED_RESULT = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz fizz: 4 buzz: 3 fizzbuzz: 1 lucky: 2 integer: 10";
    	
    	executeAppMain( new String[] {"1","20"} );
        
        assertEquals(EXPECTED_RESULT, SystemUtil.getValue(systemOutRule));
    }
    
    @Test
    public void whenScriptRunsWithInsuficientParamsTest() 
    {
        executeAppMain( new String[] {"1"} );
        
        assertEquals(ERROR_MSG_INVALID_NUMBER_OF_PARAMS, SystemUtil.getValue(systemErrRule));
    }
    
    @Test
    public void whenScriptRunsWithSwitchedRangesTest() 
    {
        executeAppMain( new String[] {"20","1"} );
        
        assertEquals(ERROR_MSG_MAXIMUM_RANGE_GREATER_THAN_MINIMUM, SystemUtil.getValue(systemErrRule));
    }
    
    private void executeAppMain(String[] args)
    {
    	App.main(args);
    }
    
}
