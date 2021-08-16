package com.Code_with_Harry;

public class Cwh_24_Break_Continue {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println(i);
            if(i==2){
                System.out.println("Ending the Loop");
                continue;
            }
        }
    }
}
