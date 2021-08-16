package com.Manoj_Sir.MethodOverriding;


//   Method Overriding

//    This is also called Runtime Polymorphism because at the time of calling method we are able to know ,
//    which method will be called.

public class Overriding_Child extends Overriding_Parent{
    public void first(){
        System.out.println("This is  Overriding Child Class");
    }

    public static void main(String[] args) {
        Overriding_Child objchild=new Overriding_Child();
        objchild.first();

        Overriding_Parent objparent=new Overriding_Parent();
        objparent.first();

        Overriding_Parent obj=new Overriding_Child();
        obj.first();

//        Overriding_Child object=new Overriding_Parent();     // Compile Time Error
    }
}
