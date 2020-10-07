package com.library;

public enum MenuItem {

    SHOW_ALL_ACTORS("1. Show all actors"),
    SHOW_ALL_CUSTOMERS("2. Show all customers"),
    SHOW_ALL_MOVIES("3. Show all movies"),
    SHOW_ALL_PRODUCTION_COMPANIES("4. Show all production companies"),
    ADD_NEW_ACTOR("5. Add new actor"),
    ADD_NEW_CUSTOMER("6. Add new customer"),
    ADD_NEW_MOVIE("7. Add new movie"),
    ADD_NEW_PRODUCTION_COMPANY("8. Add new production company"),
    SHOW_ACTOR("9. Show actor"),
    SHOW_CUSTOMER("10. Show customer"),
    SHOW_MOVIE("11. Show movie"),
    SHOW_PRODUCTION_COMPANY("12. Show production company"),
    REMOVE_ACTOR("13. Remove actor"),
    REMOVE_CUSTOMER("14. Remove customer"),
    REMOVE_MOVIE("15. Remove movie"),
    REMOVE_PRODUCTION_COMPANY("16. Remove production company"),
    SORT_ACTOR_LIST("17. Sort actors list"),
    HELP_MENU("18. Show help menu"),
    EXIT_PROGRAM("19. Exit Movie Library Program");

    public String description;

    MenuItem(String description){
        this.description = description;
    }
}
