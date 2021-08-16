package com.Manoj_Sir.Exception;

public class Demo_Exception {
    public int divide(int a,int b){
        int result=0;
        try {
             result=a/b;
        }
catch (Exception e){
    System.out.println("Exception occured and Catched Here....");
}
        return result;
    }

    public static void main(String[] args) {
        Demo_Exception obj=new Demo_Exception();
    int output= obj.divide(6,0);
        System.out.println("Result is "+output);
    }
}
