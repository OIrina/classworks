package com.ira.classwork6;

import com.ira.classwork4.Person;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Irina on 23-Oct-14.
 */
public class MergeDelegate {
    private final ListPersonMerge personMerge;

    public MergeDelegate (ListPersonMerge personMerge){
        this.personMerge = personMerge;
    }

    public List<Person> mergeInnerPerson (List<Person> firstList, List<Person> secondList){
        List<Person> persons = personMerge.mergeInnerPerson(firstList, secondList);

        System.out.println("result = " + persons.toString());
        return persons;
    }

}
