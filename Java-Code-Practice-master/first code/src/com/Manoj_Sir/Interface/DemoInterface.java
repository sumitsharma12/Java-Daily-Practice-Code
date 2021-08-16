package com.Manoj_Sir.Interface;

public interface DemoInterface {

//    Interface
//    A class which is having all methods as abstract method .

    public  void m1();
    public  void  m2();
    public  void m3();

//    Variables
    int a=20; //public static final a=20;
    int b=40;

//    Java 1.8 Newly added Features

    default public void show(){
        System.out.println("show");
    }
    public static void abc(){
        System.out.println("abc");
    }


}
