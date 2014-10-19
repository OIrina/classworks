package com.ira.classwork3;

import java.util.Arrays;

public class ArrayHelperOldTest {

    public static void main(String[] args) {
        ArrayHelperOldTest test = new ArrayHelperOldTest();
        boolean[] testAssertationResults = new boolean[3];
        testAssertationResults[0] = test.testInnerUnion();
        testAssertationResults[1] = test.testInnerUnion_FirstArraysIsEmpty();
        testAssertationResults[2] = test.testOuterUnion();

        int countOfFailedTests =0;
        int countOfSuccessfulTests = 0;
        for (boolean result: testAssertationResults){
            if(result)
                countOfSuccessfulTests++;
            else
                countOfFailedTests++;
        }
        System.out.println("Total test count " +testAssertationResults.length);
        System.out.println("Count Of Successful Tests " +countOfSuccessfulTests);
        System.out.println("Count Of Failed Tests " +countOfFailedTests);
    }

    public boolean testInnerUnion() {
        System.out.println("Starting testInnerUnion");
        // initialize variable inputs
        int[] inputArrayFirst = {1, 5, 4, 23, 65, 32, 78};
        int[] inputArraySecond = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};

        int[] expectedValues = {1, 4, 5, 32};

        // initialize class to test
//        ArrayHelper testClass = new ArrayHelper();

        // invoke method on class to test
        int[] returnedValue = ArrayHelper.innerUnion(inputArrayFirst, inputArraySecond);
        System.out.println("Result array " + Arrays.toString(returnedValue));

        // assert return value
        boolean assertationResult = Arrays.equals(expectedValues, returnedValue);
        System.out.println("Is test successful = " +assertationResult);
        return assertationResult;

    }

    public boolean testInnerUnion_FirstArraysIsEmpty() {
        System.out.println("Starting testInnerUnion_FirstArraysIsEmpty");
            // initialize variable inputs
            int[] inputArrayFirst = {};
            int[] inputArraySecound = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};

            int[] expectedValues = {1};

            // initialize class to test
//            ArrayHelper testClass = new ArrayHelper();

            // invoke method on class to test
            int[] retunedValue = ArrayHelper.innerUnion(inputArrayFirst, inputArraySecound);
            System.out.println("Result array " + Arrays.toString(retunedValue));

            // assert return value
            boolean assertationResult = Arrays.equals(expectedValues, retunedValue);
            System.out.println("Is test successful = " +assertationResult);
        return assertationResult;
        }

    public boolean testOuterUnion() {
        System.out.println("Starting testOuterUnion");

        int[] inputArrayFirst = {0, 1, 2, 3};
        int[] inputArraySecond = {1, 2, 3, 4, 5};

        int[] expectedValue = {0, 4, 5};

        int[] returnedValue = ArrayHelper.outerUnion(inputArrayFirst, inputArraySecond);
        System.out.println("Result array " + Arrays.toString(returnedValue));


        boolean assertationResult = Arrays.equals(expectedValue, returnedValue);
        System.out.println("Is test succesful = " + assertationResult);

        return assertationResult;

    }

    public boolean testLeftUnion(){
        System.out.println("Starting testLeftUnion");

        int[] inputArrayFirst = {9, 3, 1};
        int[] inputArraySecond = {1, 2, 3, 4, 5};

        int[] expectedValue = {9, 3, 1, 1, 3};

        int[] returnedValue = ArrayHelper.leftUnion(inputArrayFirst, inputArraySecond);
        System.out.println("Result array " + Arrays.toString(returnedValue));

        boolean assertationResult = Arrays.equals(expectedValue, returnedValue);
        System.out.println("Is test cuccesful = " + assertationResult);

        return assertationResult;
    }

}
