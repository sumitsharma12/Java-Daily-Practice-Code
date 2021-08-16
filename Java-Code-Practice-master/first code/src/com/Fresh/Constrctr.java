package com.Fresh;

public class Constrctr {

    public Constrctr(){
        System.out.println("Default constructor");
    }
   public Constrctr(int a){
       System.out.println("Parameterized constructor"+a);
   }

    public static void main(String[] args) {
        new Constrctr(22);
    }
}
