package com.example.myapplicationmsk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.*;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //private
    //package access
    //protected
    //public

    Cat myCat;
    int z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat cat1 = new Cat();
        cat1.catchMouse(1);
        cat1.catchMouse(3);
    }

}