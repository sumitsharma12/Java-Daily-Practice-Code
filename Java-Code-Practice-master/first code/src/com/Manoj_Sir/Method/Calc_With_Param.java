package com.Manoj_Sir.Method;

public class Calc_With_Param {
    public void add(int a,int b){
        int result=a+b;
        System.out.println("Result of addition is "+result);
    }
    public void sub(int a,int b){
        int result=a-b;
        System.out.println("Result of subtraction is "+result);
    }
    public void multiply(int a,int b){
        int result=a*b;
        System.out.println("Result of Multiply is "+result);
    }
    public void divide(int a,int b){
        int result=a/b;
        System.out.println("Result of divide is "+result);
    }

    public static void main(String[] args) {
        Calc_With_Param obj=new Calc_With_Param();
        obj.add(2,6);
        obj.sub(40,20);
        obj.multiply(22,3);
        obj.divide(40,20);
    }
}
