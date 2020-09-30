package com.library;

import java.util.ArrayList;

public class MovieLibraryProgram {

    private static MovieLibraryProgram instance = null;

    private ArrayList<Movie> movies;
    private ArrayList<Customer> customers;
    private ArrayList<Actor> actors;
    private ArrayList<ProductionCompany> productionCompanies;

    private MovieLibraryProgram(){
        System.out.println("Welcome to the Movie Library");
        movies = FileUtils.readMovieObjects("Movie.ser");
        customers = FileUtils.readCustomerObjects("Customer.ser");
        actors = FileUtils.readActorObjects("Actor.ser");
        productionCompanies = FileUtils.readCompanyObjects("Company.ser");
        if (movies == null) movies = new ArrayList<>();
        if (customers == null) customers = new ArrayList<>();
        if ((actors == null)) actors = new ArrayList<>();
        if (productionCompanies == null) productionCompanies = new ArrayList<>();
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
                case SHOW_ALL_ACTORS:
                    showAllActors();
                    break;
                case SHOW_ALL_MOVIES:
                    showAllMovies();
                    break;
                case SHOW_ALL_PRODUCTION_COMPANIES:
                    showAllProductionCompanies();
                    break;
                case ADD_NEW_ACTOR:
                    addNewActor();
                    break;
                case ADD_NEW_MOVIE:
                    addNewMovie();
                    break;
                case ADD_NEW_PRODUCTION_COMPANY:
                    addNewProductionCompany();
                    break;
                case SHOW_ACTOR:
                    showActor();
                    break;
                case SHOW_MOVIE:
                    showMovie();
                    break;
                case SHOW_PRODUCTION_COMPANY:
                    showProductionCompany();
                    break;
                case REMOVE_ACTOR:
                    removeActor();
                    break;
                case REMOVE_MOVIE:
                    removeMovie();
                    break;
                case REMOVE_PRODUCTION_COMPANY:
                    removeProductionCompany();
                    break;
                case SORT_ACTOR_LIST:
                    sortActorList();
                    break;
                case SORT_MOVIE_LIST:
                    sortMovieList();
                    break;
                case SORT_PRODUCTION_COMPANY_LIST:
                    sortProductionCompanyList();
                    break;
                case HELP_MENU:
                    helpMenu();
                    break;
                case EXIT_PROGRAM:
                    exitProgram();
                    break;
                    default:
                        System.out.println("ERROR M8");
            }
        }while (isRunning);
    }

    private void showAllActors(){
        View.getInstance().showActors(actors);
    }

    private void showAllMovies(){
        View.getInstance().showMovies(movies);
    }

    private void showAllProductionCompanies(){
        View.getInstance().showProductionCompanies(productionCompanies);
    }

    private void addNewActor(){
        Actor actor = View.getInstance().addNewActor();
        actors.add(actor);
    }

    private void addNewMovie(){
        Movie movie = View.getInstance().addNewMovie();
        movies.add(movie);
    }

    private void addNewProductionCompany(){
        ProductionCompany company = View.getInstance().addNewProductionCompany();
        productionCompanies.add(company);
    }

    private void showActor(){
        View.getInstance().searchAndPrintPerson(actors);
    }

    private void showMovie(){
        View.getInstance().searchAndPrintMovie(movies);
    }

    private void showProductionCompany(){
        View.getInstance().searchAndPrintProductionCompany(productionCompanies);
    }

    private void removeActor(){
        View.getInstance().removeActor(actors);
    }

    private void removeMovie(){
        View.getInstance().removeMovie(movies);
    }

    private void removeProductionCompany(){
        View.getInstance().removeProductionCompany(productionCompanies);
    }

    private void sortActorList(){
        switch (View.getInstance().getSortMethod()){
            case SHUFFLE_ARRAY:
                actors = ArrayUtil.shuffleArray(actors);
                break;
            case GREATEST_TO_LEAST:
                actors = ArrayUtil.greatestFirst(actors);
                break;
            case LEAST_TO_GREATEST:
                actors = ArrayUtil.leastFirst(actors);
                break;
        }
    }

    private void sortMovieList(){
        switch (View.getInstance().getSortMethod()){
            case SHUFFLE_ARRAY:
                movies = ArrayUtil.shuffleArray(movies);
                break;
            case GREATEST_TO_LEAST:
                movies = ArrayUtil.greatestFirst(movies);
                break;
            case LEAST_TO_GREATEST:
                movies = ArrayUtil.leastFirst(movies);
                break;
        }
    }

    private void sortProductionCompanyList(){
        switch (View.getInstance().getSortMethod()){
            case SHUFFLE_ARRAY:
                productionCompanies = ArrayUtil.shuffleArray(productionCompanies);
                break;
            case GREATEST_TO_LEAST:
                productionCompanies = ArrayUtil.greatestFirst(productionCompanies);
                break;
            case LEAST_TO_GREATEST:
                productionCompanies = ArrayUtil.leastFirst(productionCompanies);
                break;
        }
    }

    private void helpMenu(){
        System.out.println("Welcome to Movie Library. This is a library system which you can store your movies, actors, customers and movie production companies.");
    }

}
