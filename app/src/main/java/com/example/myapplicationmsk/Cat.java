package com.example.myapplicationmsk;
import android.util.Log;

import java.util.Locale;

public class Cat extends Animal{
    int age;
    String name;
    final static int numberOfLegs= 4;
    static int count = 0;


    String helloText;
    CatMood catMood;

    static class  CountResetter{
        boolean moreThan100;

        CountResetter(){
            if(Cat.count > 5){
                moreThan100 = true;
            }
            if(moreThan100){
                resetCounter(0);
            }
        }
        void resetCounter(int value){
            Cat.count = value;
        }

    }

    class CatMood{
        int levelOfMood;

        CatMood() {
            if(Cat.this.age < 2){
                levelOfMood = 100;
            }else if(Cat.this.age >= 2 && Cat.this.age < 7) {
                levelOfMood = 50;
            }else if (Cat.this.age >= 7) {
                levelOfMood = 20;
            }
        }
    }
    private String color;
    private String breed;
    public Cat()  {

        catMood = new CatMood();

        switch (catMood.levelOfMood) {
            case 100:
                helloText = "Meow! Im young and happy cat!:) My name is " + name + ", and i`m " + age + " years old.";
                break;
            case 50:
                helloText = "Meow! Im happy cat! My name is " + name + ", and i`m " + age + " years old.";
                break;
            case 20:
                helloText = "Meow! Im old and sick cat:( My name is " + name + ", and i`m " + age + " years old.";
                break;

        }

    }
    public Cat(String color, String breed) {
        this.color = color;
        this.breed = breed;

        catMood = new CatMood();


    }
    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
        catMood = new CatMood();

        switch (catMood.levelOfMood) {
            case 100:
                helloText = "Meow! Im young and happy cat!:) My name is " + name + ", and i`m " + age + " years old.";
                break;
            case 50:
                helloText = "Meow! Im happy cat! My name is " + name + ", and i`m " + age + " years old.";
                break;
            case 20:
                helloText = "Meow! Im old and sick cat:( My name is " + name + ", and i`m " + age + " years old.";
                break;

        }
    }


    public void talk(){
        Log.i("talk()",  helloText);
    }
    public void talk(int age){
        Log.i("talk()", "Meow! i`m " + age + " years old.");
    }

    public void talk(String hello){ Log.i("talk()", "Meow! " + hello);
    }
    public static String whatCatsLike(){
        return "i like playing, jumping and sometimes scratching";
    }



    public void catchMouse(int mouseWeight){
        class Mouse{
            String color;
            int weight;

            public Mouse(String color, int weight){
                this.color = color;
                this.weight = weight;
            }

            String mouseVoice(){
                return "Pi-pi-pi";
            }
        }
        Mouse mouse = new Mouse("white", mouseWeight);

        if(mouse.weight < 2){
            Log.i("cat say ", "I will eat you!" + mouse.mouseVoice());
        }else{
            Log.i("cat say ", "I afraid you!");
        }
    }

}
