package com.emirhan.oop;

//Interface
//2 class a birden extend edemeyiz ancak birden fazla interface e implentt edebiliriz
//Bu yuzden class yerine Interface olusturulur ki implement edebilelim
public class Piano implements HouseDecor, Instrument {
    String brand;
    boolean digital;

    //If any methods given in the implemented interface, you must override here
    @Override
    public void info() {
        System.out.println("Interface method override here");
    }
}
