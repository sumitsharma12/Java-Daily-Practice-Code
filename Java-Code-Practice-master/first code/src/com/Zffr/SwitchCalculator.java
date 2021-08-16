package com.Zffr;
import java.util.Scanner;
public class SwitchCalculator {
    public void add(int num1, int num2){
        int result=num1+num2;
        System.out.println(result);
    }
    public void sub(int num1, int num2){
        int result=num1-num2;
        System.out.println(result);
    }

    public static void main(String[] args) {
        SwitchCalculator obj=new SwitchCalculator( );
        Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
        System.out.println("Enter number 1");
        int num1= sc.nextInt();

        System.out.println("Enter number 2");
        int num2=sc.nextInt();
        switch (num){
            case 1:
                obj.add(num1,num2);
                break;
            case 2:
                obj.sub(num1,num2);
                break;
        }
    }
}

