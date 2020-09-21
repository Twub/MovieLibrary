package com.library;

import java.io.Serializable;

public class Customer extends Person implements Serializable, Comparable<Customer> {

    public Customer(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public String toString() {
        return "Name: " + getFirstName() + " " + getLastName() + " Age: " + getAge();
    }

    @Override
    public int compareTo(Customer o) {
        return (getAge() - o.getAge());
    }
}
