package com.Fresh.ConditonalStatement;

public class Swtch {
    public void Check(int num) {
        switch (num) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            default:
                System.out.println("Not mentioned");
        }

    }

    public static void main(String[] args) {
        Swtch obj=new Swtch();
        obj.Check(22);
    }
        }
