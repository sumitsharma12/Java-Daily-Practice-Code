package com.practicepage.Inheritance;

public class Child extends Parent{
    public static void main(String[] args) {
        Child obj=new Child();
        System.out.println(obj.name);
        int result= obj.age;
        System.out.println(result);
        obj.first();
        obj.second();
    }
}
