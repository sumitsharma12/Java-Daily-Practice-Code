package com.Fresh.ConditonalStatement;

public class RightLeftTraingle {
    public void Right(){
        for(int i=1;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
public void Left(){
        for(int a=0;a<5;a++){
            for(int b=5;b>a;b--){
                System.out.print("*");
            }
            System.out.println();
        }
}



    public static void main(String[] args) {
        RightLeftTraingle obj=new RightLeftTraingle();
        obj.Right();
        obj.Left();
    }
}
