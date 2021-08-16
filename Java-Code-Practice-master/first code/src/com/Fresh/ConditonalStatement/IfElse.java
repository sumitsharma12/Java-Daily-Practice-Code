package com.Fresh.ConditonalStatement;

public class IfElse {
    public void First(int age){
        if(age>18){
            System.out.println("You can drive");
        }
        else{
            System.out.println("You cannot drive");
        }
    }

    public static void main(String[] args) {
        IfElse obj=new IfElse();
        obj.First(18);
    }
}
