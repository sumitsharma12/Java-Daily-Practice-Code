package com.Practice;

public class Hello {
    public void main(){
        System.out.println("hello world");
        second();
    }
public  static void second(){
    System.out.println("hello static");
}
    public static void main(String[] args) {
        Hello obj=new Hello();
        obj.main();
//        second();
    }
}
