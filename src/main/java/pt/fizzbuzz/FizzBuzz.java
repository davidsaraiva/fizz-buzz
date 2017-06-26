package pt.fizzbuzz;

public class FizzBuzz {
    
    private final static int LUCKY_NUMBER = 3;
    public final static String LUCKY_RESULT = "lucky";
    
    public String encodeFizzBuzz(int number) {
        
        if (FizzBuzzOperations.containsNumber(number, LUCKY_NUMBER)) {
            return LUCKY_RESULT;
        }
        
        final boolean isFizz = FizzBuzzOperations.isMultiple(number, FizzBuzzRule.FIZZ.getRuleMultipleFactor());
        final boolean isBuzz = FizzBuzzOperations.isMultiple(number, FizzBuzzRule.BUZZ.getRuleMultipleFactor());
        
        StringBuilder result = new StringBuilder();
        
        if (isFizz) {
            result.append(FizzBuzzRule.FIZZ.getRuleResult());
        }
        if (isBuzz) {
            result.append(FizzBuzzRule.BUZZ.getRuleResult());
        }
        
        return result.length() == 0 ? String.valueOf(number) : result.toString();
        
    }
    
    public enum FizzBuzzRule {
         FIZZ("Fizz", 3)
        ,BUZZ("Buzz", 5);
        
        private String ruleResult;
        private int ruleMultipleFactor;
        
        FizzBuzzRule(String ruleResult, int ruleMultipleFactor) {
             this.ruleResult = ruleResult;
             this.ruleMultipleFactor = ruleMultipleFactor;
        }

        public String getRuleResult() {
            return ruleResult;
        }

        public int getRuleMultipleFactor() {
            return ruleMultipleFactor;
        }
        
    }
}
