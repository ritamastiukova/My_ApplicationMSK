package com.example.myapplicationmsk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    //private
    //package acces
    //protected
    //public

    Cat myCat;
    int z;
    Cat murzik;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        z = z++;

        myCat = new Cat(4, "Puma");
        myCat.talk();
        //murzik.breathe();

        Cat vaska = new Cat();
        vaska.talk("Meow, meow!");


        Cat murzik = new Cat(2, "Murza");
        murzik.talk();


        Cat glasha = new Cat();
        glasha.age = 1;
        glasha.name = "Masha";
        glasha.number0fLegs = 4;
        Log.i("number0fLegs", String.valueOf(glasha.number0fLegs));
        glasha.talk();


    }
}