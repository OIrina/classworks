package com.ira.classwork6;

import com.ira.classwork4.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Irina on 23-Oct-14.
 */
public class ListPersonMergeTest {
    @Test
    public void testMergeInnerPerson(){
        System.out.println("Starting test testMergeInnerPerson");

        List<Person> firstList = Arrays.asList(
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
        );
        List<Person> secondList = Arrays.asList(
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
        );

        MergeDelegate delegate = new MergeDelegate(new ListPersonMerge());
        List<Person> returnedValue = delegate.mergeInnerPerson(firstList,secondList);

        List<Person> expectedValue = Arrays.asList(
                new Person.Builder()
                        .firstName("Sasha2")
                        .secondName("SSS")
                        .mail("dgr")
                        .phone("123")
                        .build()
        );
        System.out.println("Result List is:" + returnedValue.toString());

        Assert.assertTrue(expectedValue.equals(returnedValue));
    }
}
