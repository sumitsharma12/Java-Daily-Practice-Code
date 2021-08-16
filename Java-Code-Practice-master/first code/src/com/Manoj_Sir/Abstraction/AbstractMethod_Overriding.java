package com.Manoj_Sir.Abstraction;

public  class AbstractMethod_Overriding extends Abstract_Class {

    @Override
    public void m1() {
        System.out.println("This is m1 method");
    }

    public static void main(String[] args) {
        AbstractMethod_Overriding obj=new AbstractMethod_Overriding();
        obj.m1();
        System.out.println(b);
        System.out.println(obj.a);
    }
}
