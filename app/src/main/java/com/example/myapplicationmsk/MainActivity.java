package com.example.myapplicationmsk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    Cat myCat;
    Cat murzik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCat = new Cat(4, "Puma");
        myCat.talk();
        //murzik.breathe();


        Cat murzik = new Cat(2, "Murza");
        murzik.talk();


        Cat glasha = new Cat();
        glasha.age = 1;
        glasha.name = "Glasha";
        glasha.number0fLegs = 4;
        Log.i("number0fLegs",  String.valueOf(glasha.number0fLegs));
        glasha.talk();

        Puma puma = new Puma();
        puma.name = "Leo";
        puma.breathe();
        puma.talk();
        puma.isAlive = true;
        Log.i("isAlive",  String.valueOf(puma.isAlive));
        Log.i("breathe()","My name is" + puma.name + " and " + puma.breathe());
    }
}