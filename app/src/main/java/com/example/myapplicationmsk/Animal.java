package com.example.myapplicationmsk;
import android.util.Log;

public abstract class Animal {
    int numberOfLegs;
    boolean isAlive;


    abstract public void draw();

    public void breathe() {
        Log.i("Breathe()", "I can breathe");

    }
}

