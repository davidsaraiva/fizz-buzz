package pt.fizzbuzz;

public class FizzBuzzOperations {

    private static final int IS_MULTIPLE_RESULT = 0;
    
    private FizzBuzzOperations() {
    }
    
    public static boolean isMultiple(int numberToTest, int multipleFactor) {
        return numberToTest % multipleFactor == IS_MULTIPLE_RESULT;
    }
    
    public static boolean containsNumber(int numberToTest, int numberToFind) {
        return String.valueOf(numberToTest).contains(String.valueOf(numberToFind));
    }
}
