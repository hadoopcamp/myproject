package com.myproject;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Lillie!");
        System.out.println("Hello World");
        System.out.println("Hello.main");

        Person person1 = new Person();
        person1.Hello();

        myproject.Person person2 = new myproject.Person();
        person2.hello();
    }
}
