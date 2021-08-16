package com.Manoj_Sir.Class_Object;

public class Person {
    String name;
    int age;
    int id;

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public static void main(String[] args) {
        Person obj=new Person("sumit",24,56252);
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.id);
        Person obj2=new Person("shubham",24,76738);
        System.out.println(obj2.name);
        System.out.println(obj2.age);
        System.out.println(obj2.id);
    }
}
