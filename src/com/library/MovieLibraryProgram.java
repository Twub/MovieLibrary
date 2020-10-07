package com.library;

import java.io.File;
import java.util.ArrayList;

public class MovieLibraryProgram {

    private static MovieLibraryProgram instance = null;

    private ArrayList<Movie> movies;
    private ArrayList<Customer> customers;
    private ArrayList<Actor> actors;
    private ArrayList<ProductionCompany> productionCompanies;
    private boolean isRunning = true;

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


        do {
            switch (View.getInstance().showAndGetMenuChoice()){
                case SHOW_ALL_ACTORS:
                    showAllActors();
                    break;
                case SHOW_ALL_CUSTOMERS:
                    showAllCustomers();
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
                case ADD_NEW_CUSTOMER:
                    addNewCustomer();
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
                case SHOW_CUSTOMER:
                    showCustomer();
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
                case REMOVE_CUSTOMER:
                    removeCustomer();
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
                case HELP_MENU:
                    helpMenu();
                    break;
                case EXIT_PROGRAM:
                    exitProgram();
                    break;
                case CONVERT_CUSTOMER_TO_ACTOR:
                    convertCustomerToActor();
                    break;
                default:
                    System.out.println("ERROR M8");
            }
        }while (isRunning);
    }

    private void convertCustomerToActor(){
        Actor newActor = View.getInstance().convertCustomerToActor(customers);
        if (newActor != null){
            actors.add(newActor);
        }
    }

    private void showAllActors(){
        View.getInstance().showActors(actors);
    }

    private void showAllCustomers(){
        View.getInstance().showCustomers(customers);
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

    private void addNewCustomer(){
        Customer customer = View.getInstance().addNewCustomer();
        customers.add(customer);
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

    private void showCustomer(){
        View.getInstance().searchAndPrintPerson(customers);
    }

    private void showMovie(){
        View.getInstance().searchAndPrintMovie(movies);
    }

    private void showProductionCompany(){
        View.getInstance().searchAndPrintProductionCompany(productionCompanies);
    }

    private void removeActor(){
        int actor = View.getInstance().removeActor(actors);
        actors.remove(actor);
    }

    private void removeCustomer(){
        int customer = View.getInstance().removeCustomer(customers);
        customers.remove(customer);
    }

    private void removeMovie(){
        int movie = View.getInstance().removeMovie(movies);
        movies.remove(movie);
    }

    private void removeProductionCompany(){
        int company = View.getInstance().removeProductionCompany(productionCompanies);
        productionCompanies.remove(company);
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

    private void helpMenu(){
        System.out.println("Welcome to Movie Library. This is a library system which you can store your movies, actors, customers and movie production companies.");
    }

    private boolean exitProgram(){
        boolean exitProgramChoice = View.getInstance().exitProgramPopup();
        if (exitProgramChoice){
            for (Actor actor : actors){
                FileUtils.saveActor(actors, "Actor.ser");
            }
            for (Movie movie : movies){
                FileUtils.saveMovie(movies, "Movie.ser");
            }
            for (Customer customer : customers){
                FileUtils.saveCustomer(customers, "Customer.ser");
            }
            for (ProductionCompany productionCompany : productionCompanies){
                FileUtils.saveProductionCompany(productionCompanies, "Company");
            }
            isRunning = false;
        }
        return false;
    }

}
