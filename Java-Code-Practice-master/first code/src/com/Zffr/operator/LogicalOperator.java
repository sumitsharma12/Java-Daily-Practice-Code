package com.Zffr.operator;

public class LogicalOperator {
    public void age(int num1,int num2){
        if(num1>num2 || num1==num2){
            System.out.println("you can drive");
        }
        else{
            System.out.println("cannot");
        }

    }

    public static void main(String[] args) {
        LogicalOperator obj=new LogicalOperator();
        obj.age(2,2);
    }
}
