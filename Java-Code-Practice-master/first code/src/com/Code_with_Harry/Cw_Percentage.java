package com.Code_with_Harry;
import java.util.Scanner;
public class Cw_Percentage {
    public static void main(String[] args) {
        System.out.println("Enter Marks Out of 100");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks in Maths");
        Float subject1= sc.nextFloat();
        System.out.println("Enter Marks in English");
        Float subject2= sc.nextFloat();
        System.out.println("Enter Marks in Hindi");
        Float subject3= sc.nextFloat();
        System.out.println("Enter Marks in SST");
        Float subject4= sc.nextFloat();
        System.out.println("Enter Marks in Science");
        Float subject5= sc.nextFloat();

           Float sum=((subject1+subject2+subject3+subject4+subject5)/500)*100;
        System.out.println("Your Percentage is "+sum+"%");
    }
}
