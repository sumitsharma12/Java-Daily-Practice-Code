package com.Code_with_Harry;

public class Cwh_13_String {
    public void first(){
        String name;
        name=new String("Hello String");
        System.out.println(name);
    }
    public static void  second(){
        int a=22;
        float b=22.345f;
        char c='a';
        String d="Hello world";
        System.out.printf("The value of a is %d , the value of b is %f , the value of c is %c , the value of d is %s ...",a,b,c,d);
        System.out.println("");
        System.out.format("The value of a is %d , the value of b is %f , the value of c is %c , the value of d is %s ",a,b,c,d);
    }

    public static void main(String[] args) {
        Cwh_13_String obj=new Cwh_13_String();
        obj.first();
       second();
    }

}
