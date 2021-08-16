package com.Fresh;

public class StaticInstance {
    public static void First(){
        System.out.println("This is Static Function");
    }
    public void Second(){
        System.out.println("This is Instance Function");
    }

    public static void main(String[] args) {
        First();
        StaticInstance obj=new StaticInstance();
        obj.Second();
    }
}
