package com.myproject;

public class Person {
    String name;
    float weight;
    float height;

    public Person(float weight, float height){
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, float weight, float height){
        this(weight, height);
        this.name = name;
    }

    public void Hello() {
        System.out.println("Hello from Java!");
    }
    public float Bmi() {
        return weight / (height*height);
    }
}
