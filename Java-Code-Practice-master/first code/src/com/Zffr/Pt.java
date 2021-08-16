package com.Zffr;

public class Pt {
    short b=20;
    static byte a=30;
    double c= 4.5;
   public  void display(){
       System.out.println("This is instance function");
    }
    public static void show(){
        System.out.println("This is static function");
    }
    public int total(){
       return 2000;
    }
    public static void main(String[] args) {
        Pt obj=new Pt();
        obj.display();
        show();
        System.out.println(obj.total());
        System.out.println(a);
        System.out.println(obj.c);
        System.out.println(obj.b);
    }
}