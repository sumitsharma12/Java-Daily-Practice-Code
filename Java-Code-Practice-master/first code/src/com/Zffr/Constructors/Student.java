package com.Zffr.Constructors;


public class Student {
    int id;
    String name;
    String city;

    public Student(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

//    public Student() {
//        super();
//    }

    public static void main(String[] args) {

        Student obj = new Student(1, "sumit", "delhi");
        System.out.println(obj.id);
        System.out.println(obj.name);
        System.out.println(obj.city);
//        new Student(1,"sumit","delhi");
    }
}