package com.practicepage.Interface;

public class Second implements First{

    @Override
    public void First1() {
        System.out.println("Hello world");
//        First.m2();
//        System.out.println(First.name);
//        System.out.println(First.age);

    }

    public static void main(String[] args) {
        Second obj=new Second();

        obj.m1();
        System.out.println(First.name);
        System.out.println(First.age);
        First.m2();
    }
}
