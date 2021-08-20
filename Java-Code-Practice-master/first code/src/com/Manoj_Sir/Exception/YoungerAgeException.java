package com.Manoj_Sir.Exception;
import java.util.Scanner;

public class YoungerAgeException  extends RuntimeException {

     YoungerAgeException(String msg) {
        super(msg);
    }


        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age : ");
        int age= sc.nextInt();
        try{
            if(age<18){
                throw new YoungerAgeException("You are not eligible for Voting .");
            }
            else {
                System.out.println("You can Vote Successfully");
            }
        }
        catch ( YoungerAgeException e){
            e.printStackTrace();
        }
            System.out.println("hello");
    }
}



