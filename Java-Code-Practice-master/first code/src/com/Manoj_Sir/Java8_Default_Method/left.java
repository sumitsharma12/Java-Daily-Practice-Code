package com.Manoj_Sir.Java8_Default_Method;

 interface left {
    default void m1(){
        System.out.println("Left Interface");
    }
}
interface right{
    default void m1(){
        System.out.println("Right Interface");
    }
}
class Test implements left,right{
    public void m1(){

//        System.out.println("My own implementation will come ");
//        left.super.m1();
        right.super.m1();
    }

    public static void main(String[] args) {
        Test t=new Test();
         t.m1();
    }
}
