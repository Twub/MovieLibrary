package com.sorting;

import java.util.ArrayList;

public class MovieLibraryProgram {

    private static MovieLibraryProgram instance = null;

    private ArrayList<Movie> movies;
    private ArrayList<Customer> customers;
    private ArrayList<Actor> actors;
    private ArrayList<ProductionCompany> productionCompanies;

    private MovieLibraryProgram(){
        System.out.println("Welcome to the Movie Library");

    }

    public static MovieLibraryProgram getInstance(){
        if (instance == null){
            instance = new MovieLibraryProgram();
        }
        return instance;
    }

    public void run(){
        boolean isRunning = true;

        do {
            switch (View.getInstance().showAndGetMenuChoice()){

            }
        }while (isRunning)
    }

}
