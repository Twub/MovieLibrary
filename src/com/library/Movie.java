package com.library;

import java.io.Serializable;

public class Movie implements Serializable {

    private String title;
    private int ageLimit;
    private String description;
    private ProductionCompany productionCompany;

    public Movie(String title, String description, int ageLimit){
        this.title = title;
        this.ageLimit = ageLimit;
        this.description = description;
    }

    public String getTitle(){
        return title;
    }

    @Override
    public String toString(){
        return "Movie title: " + title + " Age limit: " + ageLimit + " Description: " + description + " Production Company: " + productionCompany.getName();
    }
}
