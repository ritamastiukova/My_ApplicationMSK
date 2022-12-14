package com.example.myapplicationmsk;

import android.util.Log;

public class Lion extends  Cat{
    public void talk(){
        Log.i("talk()", "R-r-r! I'm lion. My name is " + name + ", and I'm " + age + " yaers old."+ Lion.whatCatsLike() + "My breed " + breed + ", my color is " + color);
    }

    public static String whatCatsLike(){
        return "I'm Lion and I like playing, jumping and sometimes scratching";
    }
}
