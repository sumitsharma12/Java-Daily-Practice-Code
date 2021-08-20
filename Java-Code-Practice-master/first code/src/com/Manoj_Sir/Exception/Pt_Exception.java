package com.Manoj_Sir.Exception;

public class Pt_Exception {
    public int first(int a,int b){
        int result=0;
        try {
            result=a/b;
        }
        catch (Exception e){
            System.out.println("This is an Error");

        }
        return result;
    }

    public static void main(String[] args) {
        Pt_Exception obj=new Pt_Exception();
        int output=obj.first(2,0);
        System.out.println(output);
    }
}
