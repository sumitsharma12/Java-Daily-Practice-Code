package com.Zffr;

public class Calculator {


    public void  add(){
        System.out.println(222+2);
    }
    public void  sub(){
        System.out.println(222-2);
    }
    public void  div(){
        System.out.println(222/2);
    }
    public void  mul(){
        System.out.println(222*2);
    }

    public static void main(String[] args) {
        System.out.println("The values are ");
        Calculator obj=new Calculator();
        obj.add();
        obj.sub();
        obj.div();
        obj.mul();
    }
}
