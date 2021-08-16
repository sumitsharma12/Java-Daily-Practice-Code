package com.Code_with_Harry;

import java.util.Locale;

public class Cwh_14_StringMethod {
    public static void first(){
        String name="sumit";
        String name2=new String("sumit sharma");
        System.out.println(name);
        System.out.println(name2);
    }

    public static void second(){
        String fullname=new String("sushant Mohar");

        System.out.println(fullname.length());  //To check lenght of the string
        System.out.println(fullname.toLowerCase(Locale.ROOT));
        System.out.println(fullname.toUpperCase(Locale.ROOT));
    }

    public static void main(String[] args) {
        first();
        second();

//        sub string
        String newname="hello";
//        System.out.println(newname.substring(2));
        System.out.println(newname.substring(1,2));


//        Trim
        String newname2="           byee";
        System.out.println(newname2.trim());

//        Replace
        String newname3="harry";
        System.out.println(newname3.replace('h','b'));


//      Escape Sequence Character-----------

        System.out.println("hello \" How are YOu ?");
        System.out.println("hello \t will call you back");
        System.out.println("hello \n sushant");

    }
}
