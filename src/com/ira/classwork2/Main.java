package com.ira.classwork2;

/**
 * Created by Ira on 09.10.2014.
 */
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ira", "Onoprienko", 30, Position.DEVELOPER);
        Person p2 = new Person("John", "Smith", 35, Position.QA);
        Person p3 = new Person("Alex", "Tyschenko", 30, Position.DEVELOPER);
        Person p4 = new Person("Ira", "Onoprienko", 30, Position.DEVELOPER);

        if (p1 == p4){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
        if (p1.equals(p4)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
        if (p2 == p3){
            System.out.println("Equal");
        }
        else {
            System.out.println("Not equal");
        }
        if (p2.equals(p3)){
            System.out.println("Equal");
        }
        else {
            System.out.println("Not equal");
        }

    }
}
