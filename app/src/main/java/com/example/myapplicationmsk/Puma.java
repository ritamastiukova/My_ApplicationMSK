package com.example.myapplicationmsk;

import android.util.Log;

public class Puma extends Cat implements Movable, Printable{
    public void someMethod() {
        this.age = 3;
        this.name = "Puma";
    }
    public void talk(){
        Log.i("talk()", "R-r-r! I'm puma. My name is " + name + ",and i'm " + age + " years old");
    }

    @Override
    public void draw() {
        Log.i("draw()","Draw Puma");
    }

    @Override
    public void move() {
        Log.i("move()","Move Puma");
    }

    @Override
    public void print() {
        Log.i("print()","Print Puma");
    }
}
