package com.Code_with_Harry;
import java.util.Scanner;
public class Cwh_16_If_Else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Age :");
        int age= sc.nextInt();
        if(age>18){
            System.out.println("You can Drive a Car");
        }
        else {
            System.out.println("You are not allowed , Your age is less then 18");
        }
    }

}
