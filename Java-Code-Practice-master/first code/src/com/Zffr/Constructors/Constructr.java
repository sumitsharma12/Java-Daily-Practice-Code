package com.Zffr.Constructors;


public class Constructr {

    public Constructr() {
        System.out.println("This is Default Constructor");
    }

    public Constructr(int a) {
        System.out.println("This is Parameterised Constructor" + a);
    }

    public Constructr(String name) {
        String a = name;
        System.out.println(a);
    }

    public Constructr(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        new Constructr();
        new Constructr(2);
        new Constructr("sumit sharma");
        new Constructr(2, 7);
    }
}