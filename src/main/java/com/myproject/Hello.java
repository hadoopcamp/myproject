package com.myproject;

public class Hello {
    public static void main(String[] args) {
/*        System.out.println("Hello Lillie!");
        System.out.println("Hello World");
        System.out.println("Hello.main");*/

        Person person1 = new Person(60.34f, 1.82f);
        person1.Hello();
        person1.name = "Jimmy";
//        person1.height = 1.82f;
//        person1.weight = 60.34f;
        System.out.println(person1.name + " is " + person1.Bmi());

        Person person2 = new Person("Maven", 70.34f, 1.65f);
        person2.Hello();
        System.out.println(person2.name + " is " + person2.Bmi());

//        myproject.Person person2 = new myproject.Person();
//        person2.hello();

/*        int i = 3;
        Integer I = 3;
        I.compareTo(i);
        I.equals(i);
        System.out.print(I.equals(i));
        Integer compare = I.compareTo(i);
        compare.toString();
        System.out.println(compare);*/
    }
}
