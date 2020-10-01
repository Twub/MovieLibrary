package com.library;

import java.io.Serializable;

public class Movie implements Serializable {

    private String title;
    private int ageLimit;
    private String description;
    private ProductionCompany productionCompany = null;

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
        String titleTmp = "Movie title: " + title;
        String ageLimitTmp = ": Age limit: " + ageLimit;
        String descTmp = ": Description: " + description;
        String productionCompanyTmp = "";
        if (productionCompany != null){
            productionCompanyTmp = ": Production company: " + productionCompany.getName();
        }
        return titleTmp + ageLimitTmp + descTmp + productionCompanyTmp;
    }
}
