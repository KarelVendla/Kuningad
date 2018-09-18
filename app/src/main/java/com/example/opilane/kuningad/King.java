package com.example.opilane.kuningad;


// Simple module class which gets us our data
public class King
{
    //Variables
    private String name;
    private int from, to;


    //Constructor
    public King(String name, int from, int to) {
        this.name = name;
        this.from = from;
        this.to = to;
    }

    //getters

    public String getName() {
        return name;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    //toString method that will return the value for each object in the ListView container
    public String toString() {
        return name;
    }
}
