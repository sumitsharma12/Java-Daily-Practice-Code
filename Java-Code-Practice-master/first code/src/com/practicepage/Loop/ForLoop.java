package com.practicepage.Loop;

public class ForLoop {
    public static void righttraingle(){
        for(int i=1;i<7;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void lefttriangle(){
        for (int i=0;i<7;i++){
            for(int j=7;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        righttraingle();
        lefttriangle();
    }
}
