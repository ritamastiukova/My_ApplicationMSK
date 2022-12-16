package com.example.myapplicationmsk;

import android.util.Log;

public interface Movable {

    int speedOfMoving = 100;

    default void move(){
        Log.i("move()","Move Puma");
    }

    static void someMethod(){
        Log.i("someMethod()","someMethod Puma");
    }

}