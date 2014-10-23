package com.ira.classwork4;

import java.util.Arrays;

/**
 * Created by Irina on 21-Oct-14.
 */
public class PersonMerge {

    public static Person[] mergeInnerPerson(Person[] firstArr, Person[] secondArr) {
        if (firstArr == null || secondArr == null) {
            return new Person[]{};
        }

        Person[] _firstArr = firstArr.clone();
        Person[] _secondArr = secondArr.clone();

        PersonComparator comparator = new PersonComparator();

        Arrays.sort(_firstArr, comparator);
        Arrays.sort(_secondArr, comparator);
        Person[] innerUnion = null;
        int traceIndex = 0;
        int peersCounter = 0;
        for (Person elem : _firstArr) {
            int position = Arrays.binarySearch(_secondArr, elem, comparator);
            if (position >= 0)
                peersCounter++;
        }

        innerUnion = new Person[peersCounter];
        for (Person elem : _firstArr) {
            int position = Arrays.binarySearch(_secondArr, elem, comparator);
            if (position >= 0) {
                innerUnion[traceIndex++] = _secondArr[position];

            }
        }

        return innerUnion;


    }



}