package com.Zffr.Conditional_Statement;

public class SwitchCase {

    public void monthcheck(int num){
        switch (num){
            case 1:
                System.out.println("January");
                break;
            case 2:
                    System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            default:
                System.out.println("Not Matches");
        }
    }

    public static void main(String[] args) {
        SwitchCase obj=new SwitchCase();
        obj.monthcheck(12);
    }
}
