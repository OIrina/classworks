package com.ira.classwork4;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Irina on 23-Oct-14.
 */
public class PersonMergeTest {

        @Test
        public void testMergeInnerPerson() {
            System.out.println("Starting test testMergeInnerPerson");

            Person[] firstArr = {
                    new Person.Builder()
                            .firstName("Sasha1")
                            .secondName("SSS")
                            .mail("dgr")
                            .phone("123")
                            .build(),
                    new Person.Builder()
                            .firstName("Sasha2")
                            .secondName("SSS")
                            .mail("dgr")
                            .phone("123")
                            .build()
            };
            Person[] secondArr = {
                    new Person.Builder()
                            .firstName("Sasha2")
                            .secondName("SSS")
                            .mail("dgr")
                            .phone("123")
                            .build(),
                    new Person.Builder()
                            .firstName("Sasha3")
                            .secondName("SSS")
                            .mail("dgr")
                            .phone("123")
                            .build()
            };

            PersonMergeDelegate delegate = new PersonMergeDelegate(new PersonMerge());
            Person[] returnedValue = delegate.mergeInnerPerson(firstArr, secondArr);

            Person[] expectedValue = {
                    new Person.Builder()
                            .firstName("Sasha2")
                            .secondName("SSS")
                            .mail("dgr")
                            .phone("123")
                            .build()
            };

            System.out.println("Result array " + Arrays.toString(returnedValue));

            Assert.assertArrayEquals(expectedValue, returnedValue);
        }
    }
