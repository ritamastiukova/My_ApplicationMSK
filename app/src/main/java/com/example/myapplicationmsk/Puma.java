package com.example.myapplicationmsk;

import android.util.Log;

public class Puma extends  Cat{
    public void talk(){
        Log.i("talk()", "R-r-r! I'm puma.My name is " + name + ", and I'm " + age + " yaers old. My breed " + breed + ", my color is " + color);
    }
}