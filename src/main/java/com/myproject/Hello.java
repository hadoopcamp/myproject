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

        int i = 3;
        Integer I = 3;
        I.compareTo(i);
        I.equals(i);
        System.out.print(I.equals(i));
        Integer compare = I.compareTo(i);
        compare.toString();
        System.out.println(compare);
    }
}
