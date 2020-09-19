package com.emirhan.oop;

public class SuperMusician {
    
    private String name;
    private String instrument;
    private int age;

    public SuperMusician(String name, String instrument, int age) {
        this.name = name;
        this.instrument = instrument;
        this.age = age;

    }

    //Encapsulation - we set properties as private
    //Then we can decide if those are readable and rewritable by setting getter setter

    //Now its readable from other classes
    public String getName() {
        return name;
    }
    public String getInstrument() {
        return instrument;
    }
    public int getAge() {
        return age;
    }

    //Now its rewritable from other classes
    public void setName(String name) {
        this.name = name;
    }
    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
