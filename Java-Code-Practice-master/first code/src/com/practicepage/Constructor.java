package com.practicepage;

public class Constructor {
    public Constructor(){
        System.out.println("First constructor");
    }
    public Constructor(int age){
        System.out.println("second constructor "+age);
    }

    public static void main(String[] args) {
        new Constructor();
        new Constructor(22);
    }
}
