package com.Manoj_Sir.Exception;

import javafx.beans.binding.Bindings;

public class TryCatch {
//    public static void main(String[] args) {
//        int a=100;int b=0;int c = 0;
//        try{
//            c=a/b;
//        }
//        catch (Exception e){
//            System.out.println("Your answer is");
//        }
//
//        System.out.println(c);
//    }

    public static void main(String[] args) {


        try{
            String name=null;
            System.out.println(name.length());
        }
        catch (Exception e){
            System.out.println("Null error");
            e.printStackTrace();
        }

    }

}
