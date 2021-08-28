package com.practicepage.AbstractMethod;

public class SecondClass extends FirstClass{
    public static void main(String[] args) {
        SecondClass obj=new SecondClass();
        obj.first();
        System.out.println(obj.name);
        System.out.println(obj.age);
    }

    @Override
    public void first() {
        System.out.println("hello world");
    }
}
