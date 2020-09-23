package com.library;

import java.util.ArrayList;
import java.util.Scanner;

public class View {

    private static View instance = null;

    private View(){

    }

    public static View getInstance(){
        if (instance == null){
            instance = new View();
        }
        return instance;
    }

    public MenuItem showAndGetMenuChoice(){
        printMenu();
        Scanner input = new Scanner(System.in);
        System.out.println("Select menu choice.");
        int menuInput = input.nextInt();
        switch (menuInput){
            case 1:
                return MenuItem.SHOW_ALL_ACTORS;
            case 2:
                return MenuItem.SHOW_ALL_MOVIES;
            case 3:
                return MenuItem.SHOW_ALL_PRODUCTION_COMPANIES;
            case 4:
                return MenuItem.ADD_NEW_ACTOR;
            case 5:
                return MenuItem.ADD_NEW_MOVIE;
            case 6:
                return MenuItem.ADD_NEW_PRODUCTION_COMPANY;
            case 7:
                return MenuItem.SHOW_ACTOR;
            case 8:
                return MenuItem.SHOW_MOVIE;
            case 9:
                return MenuItem.SHOW_PRODUCTION_COMPANY;
            case 10:
                return MenuItem.REMOVE_ACTOR;
            case 11:
                return MenuItem.REMOVE_MOVIE;
            case 12:
                return MenuItem.REMOVE_PRODUCTION_COMPANY;
            case 13:
                return MenuItem.SORT_ACTOR_LIST;
            case 14:
                return MenuItem.SORT_MOVIE_LIST;
            case 15:
                return MenuItem.SORT_PRODUCTION_COMPANY_LIST;
            case 16:
                return MenuItem.HELP_MENU;
            case 17:
                return MenuItem.EXIT_PROGRAM;
        }
        return null;
    }

    private void printMenu(){
        for (MenuItem item : MenuItem.values()){
            System.out.println(item.description);
        }
    }

    public void showActors(ArrayList<Actor> actors){
        for (Actor actor : actors){
            System.out.println(actor);
        }
    }

    public void showCustomers(ArrayList<Customer> customers){
        for (Customer customer : customers){
            System.out.println(customer);
        }
    }

    public void showMovies(ArrayList<Movie> movies){
        for (Movie movie : movies){
            System.out.println(movie);
        }
    }

    public void showProductionCompanies(ArrayList<ProductionCompany> productionCompanies){
        for (ProductionCompany company : productionCompanies){
            System.out.println(company);
        }
    }

    public int selectActor(ArrayList<Actor> actors){
        Scanner input = new Scanner(System.in);
        for (int i=0; i < actors.size(); i++){
            System.out.println((i+1) + ": " + actors.get(i));
        }
        int selectedActor = input.nextInt() - 1;
        return selectedActor;
    }

    public int selectCustomer(ArrayList<Customer> customers){
        Scanner input = new Scanner(System.in);
        for (int i=0; i < customers.size(); i++){
            System.out.println((i+1) + ": " + customers.get(i));
        }
        int selectedCustomer = input.nextInt() - 1;
        return selectedCustomer;
    }

    public int selectMovie(ArrayList<Movie> movies){
        Scanner input = new Scanner(System.in);
        for (int i=0; i < movies.size(); i++){
            System.out.println((i+1) + ": " + movies.get(i));
        }
        int selectedMovie = input.nextInt() - 1;
        return selectedMovie;
    }

    public int selectProductionCompany(ArrayList<ProductionCompany> productionCompanies){
        Scanner input = new Scanner(System.in);
        for (int i=0; i < productionCompanies.size(); i++){
            System.out.println((i+1) + ": " + productionCompanies.get(i));
        }
        int selectedProductionCompany = input.nextInt() - 1;
        return selectedProductionCompany;
    }

    public Actor addNewActor(){
        Scanner input = new Scanner(System.in);
        String firstName, lastName;
        int age;
        System.out.println("Type in actors first name.");
        firstName = input.next();
        System.out.println("Type in actors last name.");
        lastName = input.next();
        System.out.println("Type in actors age");
        age = Integer.parseInt(input.next());
        return (Actor) Factory.createPerson(Factory.ObjectType.ACTOR, firstName, lastName, age);
    }

    public Customer addNewCustomer(){
        Scanner input = new Scanner(System.in);
        String firstName, lastName;
        int age;
        System.out.println("Type in customers first name.");
        firstName = input.next();
        System.out.println("Type in customers last name.");
        lastName = input.next();
        System.out.println("Type in customers age.");
        age = Integer.parseInt(input.next());
        return (Customer) Factory.createPerson(Factory.ObjectType.CUSTOMER, firstName, lastName, age);
    }

    public Movie addNewMovie(){
        Scanner input = new Scanner(System.in);
        String title, description;
        int ageLimit;
        System.out.println("Type in the movies title.");
        title = input.next();
        System.out.println("Type in the movies description.");
        description = input.next();
        System.out.println("Type in the movices age limit.");
        ageLimit = Integer.parseInt(input.next());
        return Factory.createMovie(title, description, ageLimit);
    }

    public ProductionCompany addNewProductionCompany(){
        Scanner input = new Scanner(System.in);
        String name, address;
        int netWorth;
        System.out.println("Type in the company name.");
        name = input.next();
        System.out.println("Type in the company address.");
        address = input.next();
        System.out.println("Type in the company net worth.");
        netWorth = Integer.parseInt(input.next());
        return Factory.createProductionCompany(name, address, netWorth);
    }

    
}
