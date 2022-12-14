package com.example.myapplicationmsk;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    Cat myCat;
    int z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat vaska = new Cat();
        vaska.talk("Meow, meow!");

        Puma bagira = new Puma();
        bagira.talk();

        Cat puma = new Cat();
        puma.talk();

        Cat murzik = new Lion();
        murzik.talk();

    }
}