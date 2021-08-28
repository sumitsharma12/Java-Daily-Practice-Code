package com.Manoj_Sir.Method;

public class Calc_With_Return_Type {
    public int subtract(int a,int b){
        int result=a-b;
        return result;
    }
public int multiply(int a,int b){
        int result=a*b;
        return result;
}
public int divide(int a,int b){

            int result=a/b;
    return result;

}

    public static void main(String[] args) {
        Calc_With_Return_Type obj=new Calc_With_Return_Type();
        System.out.println("Result is "+obj.subtract(40,20));
        System.out.println("Result is "+obj.multiply(22,3));
        System.out.println("Result is "+obj.divide(22,2));

    }
}
