package com.Manoj_Sir.Class_Object;

public class Doctor {
    String name;
    int age;
    String specialization;

    public Doctor(String name, int age, String specialization) {
        this.name = name;
        this.age = age;
        this.specialization = specialization;
    }

    public static void main(String[] args) {
        Doctor obj=new Doctor("sharma",34,"dental");
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.specialization);
       Doctor obj2=new Doctor("gupta",45,"eye");
        System.out.println(obj2.name);
        System.out.println(obj2.age);
        System.out.println(obj2.specialization);
    }
}
