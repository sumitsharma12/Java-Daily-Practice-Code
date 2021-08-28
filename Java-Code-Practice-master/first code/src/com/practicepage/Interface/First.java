package com.practicepage.Interface;

public interface First {
    public void First1();

    default public void m1() {
        System.out.println("Instance Function");
    }
    static public  void m2(){
        System.out.println("static Function ");
    }
    int age=42;
    String name="sumit sharma";
}
