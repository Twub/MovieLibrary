package com.library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayUtil {

    public enum SortMethod {
        SHUFFLE_ARRAY("Shuffle the array."),
        GREATEST_TO_LEAST("Sort greatest to least."),
        LEAST_TO_GREATEST("Sort least to greatest.");

        public String description;

        SortMethod(String description){
            this.description = description;
        }
    }

    /**
     * Shuffles the arraylist and returns it.
     * @param array - ArrayList you want to shuffle.
     * @param <T> - Generic.
     * @return - Shuffled ArrayList.
     */
    public static <T> ArrayList<T> shuffleArray(ArrayList<T> array){
        Collections.shuffle(array);
        return array;
    }

    /**
     * This method sorts the age in the arrays element so the oldest comes first and youngest last.
     * @param array - Array you want to sort.
     * @param <T> - Generic.
     * @return - Sorted Array.
     */
    public static <T extends Comparable> ArrayList<T> greatestFirst(ArrayList<T> array){
        Collections.sort(array, Collections.reverseOrder());
        return array;
    }

    /**
     * This method sorts the age in the arrays element so the youngest comes first and so on.
     * @param array
     * @param <T>
     * @return
     */
    public static <T extends Comparable> ArrayList<T> leastFirst(ArrayList<T> array){
        Collections.sort(array);
        return array;
    }

    private static <T> List<T> convertArrayToList(T array[]){
        List<T> list = new ArrayList<>();

        for (T t : array){
            list.add(t);
        }
        return list;
    }
}
