//package com.Manoj_Sir.Exception;
//import java.util.Scanner;
//
//public class Throw_Exception extends RuntimeException {
//
//  void YoungerAgeException(String msg){
//        super(String msg);
//    }
//
//
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Your Age : ");
//        int age= sc.nextInt();
//        try{
//            if(age<18){
//                throw new YoungerAgeException("You are eligible for Voting .");
//            }
//            else {
//                System.out.println("You can Vote Successfully");
//            }
//        }
//        catch ( YoungerAgeException e){
//            e.printStackTrace();
//        }
//    }
//}

