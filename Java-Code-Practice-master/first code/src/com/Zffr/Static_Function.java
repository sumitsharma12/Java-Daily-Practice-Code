package com.Zffr;

public class Static_Function {
    public static void first(){
        System.out.println("Static Function");
       add(20,30);
        System.out.println(displayName());
    }

    public static void add(int num1,int num2){
        int sum=num1+num2;
        System.out.println(sum);
        mul("cool dude");
    }

    public static  void mul(String name){
        String c=name;
        System.out.println(c);
    }

    public  static String displayName(){
       return "This will return";            //21:40
    }

    public  static int num(){
        return 22;
    }

    public static int sub(int nm1,int nm2){
        return nm1-nm2;
    }

    public static void main(String[] args) {
        first();
        add(2,3);
        mul("sumit sharma");
        mul("java course");
        System.out.println(displayName());    //21:40
        System.out.println(num());
        System.out.println(sub(4,2));
    }
}
