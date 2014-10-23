package com.ira.classwork6;

import com.ira.classwork4.Person;
import com.ira.classwork4.PersonComparator;

import java.util.*;

/**
 * Created by Irina on 23-Oct-14.
 */
public class ListPersonMerge {
    public static List<Person> mergeInnerPerson(List<Person> firstList, List<Person> secondList) {
        if (firstList == null || secondList == null) {
            return Collections.<Person>emptyList();
        }

        List<Person> _firstList = new ArrayList<>(firstList);
        List<Person> _secondList = new ArrayList<>(secondList);

        PersonComparator comparator = new PersonComparator();

        Collections.sort(_firstList, comparator);
        Collections.sort(_secondList, comparator);
        List<Person> innerUnion = null;
        int traceIndex = 0;
        int peersCounter = 0;
        for (Person elem : _firstList) {
            int position = Collections.binarySearch(_secondList, elem, comparator);
            if (position >= 0)
                peersCounter++;
        }

        innerUnion = new ArrayList<Person>(peersCounter);
        for (Person elem : _firstList) {
            int position = Collections.binarySearch(_secondList, elem, comparator);
            if (position >= 0) {
                innerUnion.add(traceIndex++, _secondList.get(position));
            }
        }
        return innerUnion;
    }
}

