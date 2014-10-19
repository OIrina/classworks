package com.ira.classwork3;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Ira on 14.10.2014.
 */
public class ArrayHelperTest {
    @Test
    public void testInnerUnion() {
        // initialize variable inputs
        int[] inputArrayFirst = {1, 5, 4, 23, 65, 32, 78};
        int[] inputArraySecond = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};

        int[] expectedValues = {1, 4, 5, 32};
        // invoke method on class to test
        int[] retunedValue = ArrayHelper.innerUnion(inputArrayFirst, inputArraySecond);
        // assert return value
        Assert.assertTrue(Arrays.equals(expectedValues, retunedValue));

    }

    @Test
    public void testInnerUnion_FirstArraysIsEmpty() {
        System.out.println("Starting testInnerUnion_FirstArraysIsEmpty");
        // initialize variable inputs
        int[] inputArrayFirst = {};
        int[] inputArraySecound = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};

        int[] expectedValues = {};

        // invoke method on class to test
        int[] retunedValue = ArrayHelper.innerUnion(inputArrayFirst, inputArraySecound);
        System.out.println("Result array " + Arrays.toString(retunedValue));

        // assert return value
        Assert.assertArrayEquals(expectedValues, retunedValue);

    }

    @Test
    public void testleftUnion_FirstArrayIsNull () {

        System.out.println("Starting testleftUnion_FirstArrayIsNull");

        int[] inputArrayFirst = null;
        int[] inputArraySecond = {1, 2, 0, 3};

        int[] expectedValue = {};

        int[] returnedValue = ArrayHelper.leftUnion(inputArrayFirst, inputArraySecond);
        System.out.println("Result array " + Arrays.toString(returnedValue));

        // assert return value
        Assert.assertArrayEquals(expectedValue, returnedValue);
    }

    @Test
    public void testOuterUnion_SecondArrayIsEmpty(){
        System.out.println("Starting testouterUnion");

        int[] inputArrayFirst = {1, 2, 0, 3};
        int[] inputArraySecond = {};

        int[] expectedValue = {1, 2, 0, 3};

        int[] returnedValue = ArrayHelper.outerUnion(inputArrayFirst, inputArraySecond);
        System.out.println("Result array " + Arrays.toString(returnedValue));

        Assert.assertArrayEquals(expectedValue, returnedValue);
    }
    @Test
    public void testOuterUnion_Duplicates() {
        System.out.println("Starting test testOuterUnion_Duplicates");

        int[] inputArrayFirst = {1, 2, 3, 4, 5};
        int[] inputArraySecond = {1, 2, 3, 4, 5};

        int[] expectedValue = {};

        int[] returnedValue = ArrayHelper.outerUnion(inputArrayFirst, inputArraySecond);
        System.out.println("Result array " + Arrays.toString(returnedValue));

        Assert.assertArrayEquals(expectedValue, returnedValue);
    }

}
