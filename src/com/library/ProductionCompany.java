package com.library;

import java.util.ArrayList;

public class ProductionCompany {

    private String name;
    private int netWorth;
    private String address;

    public ProductionCompany(String name, String address, int netWorth){
        this.name = name;
        this.address = address;
        this.netWorth = netWorth;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Company name: " + name + ": Address: " + address + ": Net worth: " + netWorth;
    }
}
