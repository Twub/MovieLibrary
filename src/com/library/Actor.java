package com.library;

import java.io.Serializable;
import java.util.ArrayList;

public class Actor extends Person implements Serializable, Comparable<Actor> {

    public Actor(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public String toString() {
        return "Name: " + getFirstName() + " " + getLastName() + " Age: " + getAge();
    }

    @Override
    public int compareTo(Actor o) {
        return (getAge() - o.getAge());
    }
}
