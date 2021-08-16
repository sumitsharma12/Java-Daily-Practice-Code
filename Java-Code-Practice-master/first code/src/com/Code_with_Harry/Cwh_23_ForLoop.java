package com.Code_with_Harry;

public class Cwh_23_ForLoop {
    public static void first(){
        System.out.println("The Odd Numbers are");
        for(int i=1;i<100;i++){
          if(i % 2 !=0){
              System.out.print(i);
          }
        }
    }

    public static void second(){
        System.out.println("The Even Numbers are:");
        for(int i=1;i<100;i++){
            if(i % 2 ==0){
                System.out.print(i);
            }
        }
    }

    public static void third(){
        for(int i=10;i>1;i--){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        first();
        second();
        third();
    }
}
