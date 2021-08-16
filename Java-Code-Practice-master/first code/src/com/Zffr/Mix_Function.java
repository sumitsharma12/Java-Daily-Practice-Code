package com.Zffr;

public class Mix_Function {
    public void First(String name){
        String c=name;
        System.out.println(c);
        System.out.println(Second(4,4));
    }
    static public int Second(int a,int b){
        return a+b;

    }
    static public void Third(){
        int _3ae=20;
        System.out.println(_3ae);
    }



    public static void main(String[] args) {
        Mix_Function obj=new Mix_Function();
        obj.First("This is Instance");
      Third();
//        System.out.println(Second(2,3));
           }
}
