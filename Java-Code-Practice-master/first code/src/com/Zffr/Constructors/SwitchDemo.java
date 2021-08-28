package com.Zffr.Constructors;

public class SwitchDemo {
    public void check(int num){
        switch (num){
            case 1:
                System.out.println("Monday");
            break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("don't Know");
        }
    }
    public static void main(String[] args) {
   SwitchDemo obj=new SwitchDemo();
   obj.check(8);

    }
}
