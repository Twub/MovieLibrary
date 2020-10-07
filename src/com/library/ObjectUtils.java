package com.library;

public  class ObjectUtils {

    private ObjectUtils(){}

    public static Actor customerToActor(Customer customer){
        String firstName = customer.getFirstName();
        String lastName = customer.getLastName();
        int age = customer.getAge();
        Actor newActor = new Actor(firstName, lastName, age);
        return newActor;
    }
}
