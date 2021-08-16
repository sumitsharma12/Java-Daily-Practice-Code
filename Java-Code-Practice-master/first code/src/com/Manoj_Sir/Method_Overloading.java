package com.Manoj_Sir;

//    Method Overloading:

//  1)  The Method with same name with different parameter is called Method Overloading/
//  2)  It can be happen in same class Only .
//  3)  It is also called Compiled time polymorphism because at time compiled time we are able to know
//       which method will be called first.


public class Method_Overloading {
    public  void first(){
        System.out.println("Method Without Parameter");
    }
    public void first(int a){
        System.out.println("Method with 1 Parameter "+ a);
    }
    public void first(int a ,int b){
        System.out.println("Method with 2 Parameter "+a +""+ b);
    }

    public static void main(String[] args) {
        Method_Overloading obj=new Method_Overloading();
        obj.first();
        obj.first(22);
        obj.first(2,4);
    }

}
