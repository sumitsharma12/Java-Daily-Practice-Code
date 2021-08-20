package com.Manoj_Sir.Exception;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int a=100;int b=0;int c;
            c=a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Hello");
        }
    }
}
