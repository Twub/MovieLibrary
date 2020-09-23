package com.library;

public abstract class Factory {

    public enum ObjectType{
        ACTOR,
        CUSTOMER,
        MOVIE,
        PRODUCTION_COMPANY
    }

    public static Person createPerson(ObjectType type, String firstName, String lastName, int age){
        switch (type){
            case ACTOR:
                return new Actor(firstName, lastName, age);
            case CUSTOMER:
                return new Customer(firstName, lastName, age);
        }
        return null;
    }

    public static Movie createMovie(String title, String description, int ageLimit){
        return new Movie(title, description, ageLimit);
    }

    public static ProductionCompany createProductionCompany(String name, String address, int netWorth){
        return new ProductionCompany(name, address, netWorth);
    }
}
