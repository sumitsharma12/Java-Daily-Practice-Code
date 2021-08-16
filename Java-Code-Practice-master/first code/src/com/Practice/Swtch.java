package com.Practice;

public class Swtch {
    public void check(int num){
        switch (num){
            case 1:
            System.out.println("January");
            break;
            case 2:
                System.out.println("February|");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 10:
                System.out.println("October");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("NOt Matches");
        }
    }

    public static void main(String[] args) {
        Swtch obj=new Swtch();
obj.check(10);
    }

}
