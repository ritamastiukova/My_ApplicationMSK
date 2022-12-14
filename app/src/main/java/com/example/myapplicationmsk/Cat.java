package com.example.myapplicationmsk;


import android.util.Log;

public class Cat extends  Animal {
    int age;
    String name;
    String breed;
    String color;
    final static int numberOfLegs = 4;

    public Cat(){
        age = 2;
        name = "Vaska";
    }

    public Cat(int age, String name, String breed, String color){
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.color = color;
    }

    public void talk(){
        Log.i("talk()", "Meow! My name is " + name + ", and I'm " + age + " yaers old. My breed " + breed + ", my color is " + color);
    }
    public void talk(int age){
        Log.i("talk()", "Meow! I'm " + age + " yaers old.");
    }
    public void talk(String hello){
        Log.i("talk()", "Meow! " + hello);
    }

    public static String whatCatsLike(){
        return "I like playing, jumping and sometimes scratching";
    }
}
