package com.example.myapplicationmsk;

import android.util.Log;

public class Cat extends Animal {
    int age;
    String name;
    private int color;
    private int breed;

    public Cat() {

    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public void talk() {
        Log.i(" talk()", "Meow! My name is" + name + ", and I'm " + age + "years old, I'm " + color + "cat, My " + breed + "meow");
    }

    public void talk(int age) {
        Log.i(" talk()", "Meow! I'm" + name + ", and I'm " + age + "years old.");
    }
    public void talk(String hello) {
        Log.i(" talk()", "Meow!" + hello);
    }
}
