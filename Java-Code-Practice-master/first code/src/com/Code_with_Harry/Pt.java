package com.Code_with_Harry;
import java.util.Scanner;
public class Pt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number you want to check Odd or Even");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("This Number is Even");
        }
        else {
            System.out.println("This Number is Odd");
        }
    }
}
