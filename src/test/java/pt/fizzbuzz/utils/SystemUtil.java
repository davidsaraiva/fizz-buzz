package pt.fizzbuzz.utils;

import org.apache.commons.lang3.StringUtils;
import org.junit.contrib.java.lang.system.SystemErrRule;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class SystemUtil {

    public static String getValue(SystemOutRule outRule){
        String sysOutValue = outRule.getLog();
        sysOutValue = sysOutValue.replaceAll(AppConstants.BREAK_LINE_EXPRESSION, StringUtils.EMPTY);
        outRule.clearLog();
        
        return sysOutValue;
    }
    
    public static String getValue(SystemErrRule errRule){
        String sysOutValue = errRule.getLog();
        sysOutValue = sysOutValue.replaceAll(AppConstants.BREAK_LINE_EXPRESSION, StringUtils.EMPTY);
        errRule.clearLog();
        
        return sysOutValue;
    }
}
