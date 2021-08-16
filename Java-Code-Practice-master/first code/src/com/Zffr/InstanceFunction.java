package com.Zffr;

public class InstanceFunction {

    public void first(){
        System.out.println("Instance");
        System.out.println(displayIt());
    }


    public int add(int num1,int num2){
        return num1+num2;
    }

    public String displayIt() {
return "hello";
    }
//        System.out.println("this is string");


    public static void main(String[] args) {
        InstanceFunction obj=new InstanceFunction();
        obj.first();
        System.out.println(obj.add(4,4));         //40:28
        System.out.println(obj.displayIt());
    }

}
