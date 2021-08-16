package com.Zffr;
import java.util.Scanner;
public class Calculate {
    public void add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Result:" + result);
    }

    public void sub(int num1, int num2) {
        int result = num1 - num2;
        System.out.println("Result:" + result);
    }

    public void div(int num1, int num2) {
        int result = num1 / num2;
        System.out.println("Result:" + result);
    }

    public void mul(int num1, int num2) {
        int result = num1 * num2;
        System.out.println("Result:" + result);
    }

    public static void main(String[] args) {

        Calculate obj = new Calculate();
        Scanner scn = new Scanner(System.in);


            System.out.println("1.Add");
            System.out.println("2.Sub");
            System.out.println("3.Mul");
            System.out.println("4.div");
            System.out.print("Enter the option :");
            int num = scn.nextInt();

            System.out.print("Enter the First Number:");
            int num1 = scn.nextInt();

            System.out.print("Enter the Second Number:");
            int num2 = scn.nextInt();

            switch (num) {

                case 1:
                    obj.add(num1, num2);
                    break;
                case 2:
                    obj.sub(num1, num2);
                    break;
                case 3:
                    obj.mul(num1, num2);
                    break;
                case 4:
                    obj.div(num1, num2);
                    break;
                default:
                    System.out.println("please enter the valid number");

            }

        }
    }


