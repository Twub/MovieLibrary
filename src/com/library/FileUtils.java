package com.library;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class FileUtils {

    public static void saveActor(ArrayList<Actor> serObj, String fileName) {
        try {

            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void saveMovie(ArrayList<Movie> serObj, String fileName) {
        try {

            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void saveCustomer(ArrayList<Customer> serObj, String fileName) {
        try {

            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void saveProductionCompany(ArrayList<ProductionCompany> serObj, String fileName) {
        try {

            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static ArrayList<Customer> readCustomerObjects(String fileName) throws java.lang.NullPointerException {
        ObjectInputStream objectInputStream = null;
        ArrayList<Customer> personArrayList = null;
        try {
            FileInputStream streamIn = new FileInputStream(fileName);
            objectInputStream = new ObjectInputStream(streamIn);
            personArrayList = (ArrayList<Customer>) objectInputStream.readObject();
            objectInputStream.close();
        }catch (Exception e){
            if (e.getStackTrace().toString().equals("[Ljava.lang.StackTraceElement;@2f2c9b19")){

            }else {
                e.printStackTrace();
            }
        }
        return personArrayList;
    }

    public static ArrayList<Actor> readActorObjects(String fileName) throws java.lang.NullPointerException {
        ObjectInputStream objectInputStream = null;
        ArrayList<Actor> personArrayList = null;
        try {
            FileInputStream streamIn = new FileInputStream(fileName);
            objectInputStream = new ObjectInputStream(streamIn);
            personArrayList = (ArrayList<Actor>) objectInputStream.readObject();
            objectInputStream.close();
        }catch (Exception e){
            if (e.getStackTrace().toString().equals("[Ljava.lang.StackTraceElement;@2f2c9b19")){

            }else {
                e.printStackTrace();
            }
        }
        return personArrayList;
    }

    public static ArrayList<Movie> readMovieObjects(String fileName) throws java.lang.NullPointerException {
        ObjectInputStream objectInputStream = null;
        ArrayList<Movie> movies = null;
        try {
            FileInputStream streamIn = new FileInputStream(fileName);
            objectInputStream = new ObjectInputStream(streamIn);
            movies = (ArrayList<Movie>) objectInputStream.readObject();
            objectInputStream.close();
        }catch (Exception e){
            if (e.getStackTrace().toString().equals("[Ljava.lang.StackTraceElement;@2f2c9b19")){

            }else {
                e.printStackTrace();
            }
        }
        return movies;
    }

    public static ArrayList<ProductionCompany> readCompanyObjects(String fileName) throws java.lang.NullPointerException {
        ObjectInputStream objectInputStream = null;
        ArrayList<ProductionCompany> companies = null;
        try {
            FileInputStream streamIn = new FileInputStream(fileName);
            objectInputStream = new ObjectInputStream(streamIn);
            companies = (ArrayList<ProductionCompany>) objectInputStream.readObject();
            objectInputStream.close();
        }catch (Exception e){
            if (e.getStackTrace().toString().equals("[Ljava.lang.StackTraceElement;@2f2c9b19")){

            }else {
                e.printStackTrace();
            }
        }
        return companies;
    }

}
