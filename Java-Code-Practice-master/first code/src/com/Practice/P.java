package com.Practice;

public class P {
    public void first(){
       for(int i=1;i<5;i++){
           for (int j=0;j<i;j++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
    public static void main(String[] args) {
    P obj=new P();
    obj.first();
    }
}
