package com.sorting;

public enum MenuItem {

    SHOW_ALL_ACTORS("1. Show all actors"),
    SHOW_ALL_MOVIES("2. Show all movies"),
    SHOW_ALL_PRODUCTION_COMPANIES("3. Show all production companies"),
    ADD_NEW_ACTOR("4. Add new actor"),
    ADD_NEW_MOVIE("5. Add new movie"),
    ADD_NEW_PRODUCTION_COMPANY("6. Add new production company"),
    SHOW_ACTOR("7. Show actor"),
    SHOW_MOVIE("8. Show movie"),
    SHOW_PRODUCTION_COMPANY("9. Show production company"),
    REMOVE_ACTOR("10. Remove actor"),
    REMOVE_MOVIE("11. Remove movie"),
    REMOVE_PRODUCTION_COMPANY("12. Remove production company"),
    SORT_ACTOR_LIST("13. Sort actors list"),
    SORT_MOVIE_LIST("14. Sort movies list"),
    SORT_PRODUCTION_COMPANY_LIST("15. Sort production company list"),
    HELP_MENU("16. Show help menu"),
    EXIT_PROGRAM("17. Exit Movie Library Program");

    public String description;

    MenuItem(String description){
        this.description = description;
    }
}
