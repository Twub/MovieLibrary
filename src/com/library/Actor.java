package com.library;

import java.io.Serializable;
import java.util.ArrayList;

public class Actor extends Person implements Serializable, Comparable<Actor> {

    private ArrayList<Movie> movies = new ArrayList<Movie>();

    public Actor(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public Movie getMovie(int index){
        return movies.get(index);
    }

    public ArrayList<Movie> getMovies(){
        return movies;
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
