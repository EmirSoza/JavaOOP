package com.emirhan.oop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User newUSer = new User("Emirhan", "Developer");
        //User class inherits from abstract People class
        //information is abstract People class' method
        System.out.println(newUSer.information());

        //Encapsulation
        SuperMusician james = new SuperMusician("James","Guitar", 50);
        //james.age = 40;
       // System.out.println(james.age); // 40 but this is not safe operation
        //to prevent this we set properties as private so it cant be reached
        //Now you cant set neither read the value
        //In order to read we use getter
        System.out.println(james.getName()); //Encapsulation-getter-readable even if its private in musician class
        //In order to write we use setter
        james.setAge(50); // Encapsulation-setter-rewritable


        //Inheritance
        SubMusician lars = new SubMusician("Lars","Drum",45);

        //Static Polymorphism
        //Ayni objede ayni method isimleriyle farkli islemleri yaptiridik
        MathCalc newMathCalc = new MathCalc();
        System.out.println(newMathCalc.sum());
        System.out.println(newMathCalc.sum(3,6));
        System.out.println(newMathCalc.sum(2,3,4));

        //Dynamic Polymorphism
        Animal myAnimal = new Animal();
        myAnimal.hoo(); // hooo hooo

        Dog myDog = new Dog();
        myDog.test(); //hoo hooo
        myDog.hoo(); // whoov whooov


        //Interface
        Piano piano = new Piano();
        piano.brand = "Yamaha";
        piano.digital = true;
        piano.info();


    }
}