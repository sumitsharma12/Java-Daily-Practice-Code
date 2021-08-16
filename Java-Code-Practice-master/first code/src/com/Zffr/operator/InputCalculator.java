package com.Zffr.operator;
import java.util.Scanner;

public class InputCalculator {

    public void add(int a,int  b){
        int add=a+b;
        System.out.println("Result is "+add);
    }
    public void sub(int a,int  b){
        int sub=a-b;
        System.out.println("Result is "+sub);
    }
    public void mul(int a,int  b){
        int mul=a*b;
        System.out.println("Result is "+mul);
    }
    public void div(int a,int  b){
        int div=a/b;
        System.out.println("Result is "+div);
    }

    public static void main(String[] args) {
        InputCalculator obj=new InputCalculator();
        Scanner scn=new Scanner(System.in);
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.divide");
        System.out.println("Enter the Option:");
        int num= scn.nextInt();
        scn.nextLine();
        System.out.println("Enter First Number");
        int num1=scn.nextInt();
        scn.nextLine();
        System.out.println("Enter Second Number");
        int num2=scn.nextInt();
        scn.nextLine();

        switch (num){
            case 1:
                obj.add(num1,num2);
                break;
            case 2:
                obj.sub(num1,num2);
                break;
            case 3:
                obj.mul(num1,num2);
                break;
            case 4:
                obj.div(num1,num2);
                break;
            default: System.out.println("Enter Valid Number");
        }



    }
}
