package com.practicepage;
import java.util.Scanner;
public class Input_Calculator {
    public void add(int num1,int num2){
        int result=num1+num2;
        System.out.println("Total Result is "+result);
    }
    public void sub(int num1,int num2){
        int result=num1-num2;
        System.out.println("Total Result is "+result);
    }

    public static void main(String[] args) {
        Input_Calculator obj=new Input_Calculator();
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 for Adding ");
        System.out.println("Press 2 for Subtract");
        System.out.println("Enter The Option You want to print");
        int num=sc.nextInt();
        System.out.println("Enter First Number");
        int num1= sc.nextInt();
        System.out.println("Enter Second Number");
        int num2= sc.nextInt();

        switch (num){
            case 1:
                obj.add(num1,num2);
                break;
            case 2:
                obj.sub(num1,num2);
                break;
            default:
                System.out.println("ERROR");

        }
    }
}
