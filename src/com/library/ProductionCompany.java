package com.library;

import java.util.ArrayList;

public class ProductionCompany {

    private String name;
    private ArrayList<Movie> movies = new ArrayList<Movie>();
    private int netWorth;
    private String address;

    public ProductionCompany(String name, String address, int netWorth){
        this.name = name;
        this.address = address;
        this.netWorth = netWorth;
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public int getNetWorth() {
        return netWorth;
    }

    public String getAddress() {
        return address;
    }
}
