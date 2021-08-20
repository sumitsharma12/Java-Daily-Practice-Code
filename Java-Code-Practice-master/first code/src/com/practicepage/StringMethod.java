package com.practicepage;

public class StringMethod {
    public void first(){
        String name;
        name=new String("hello");
        System.out.println(name);
    }
    public  void second(){
        String name2=new String("hello how are you darling");
        System.out.println(name2.trim());
    }


    public static void main(String[] args) {
        StringMethod obj=new StringMethod();
        obj.first();
        obj.second();
    }
}
