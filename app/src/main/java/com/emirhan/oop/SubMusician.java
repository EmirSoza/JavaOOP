package com.emirhan.oop;


//Inheritance from super class
//Submusician is a child of SuperMusician
public class SubMusician extends SuperMusician {
    public SubMusician(String name, String instrument, int age) {
        super(name, instrument, age);
    }

    public  String sing(){
        return "Turn the page";
    }
}
