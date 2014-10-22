package com.ira.classwork4;

import java.util.Arrays;

/**
 * Created by Irina on 21-Oct-14.
 */
public class PersonMergeDelegate {
    private final PersonMerge personMerge;

    public PersonMergeDelegate(PersonMerge personMerge) {
        this.personMerge = personMerge;
    }

    public  Person[] mergePerson(Person[] person1, Person[] person2) {
        Person[] persons = personMerge.mergePerson(person1, person2);

        System.out.println("result = "+ Arrays.toString(persons));
        return persons;

    }
}
