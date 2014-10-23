package com.ira.classwork4;

import java.util.Comparator;

/**
 * Created by Irina on 22-Oct-14.
 */
public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getFirstName().equals(o2.getFirstName())
                && o1.getSecondName().equals(o2.getSecondName())
                && o1.getMail().equals(o2.getMail())
                && o1.getPhone().equals(o2.getPhone()))
            return 0;
        if (o1.getFirstName().length() > o2.getFirstName().length())
            return 1;
        else return -1;
    }
}
