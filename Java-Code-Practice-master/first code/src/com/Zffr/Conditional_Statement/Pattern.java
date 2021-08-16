package com.Zffr.Conditional_Statement;

public class Pattern {
    public void main(){
        for(int i=0;i<=7;i++){
            System.out.print("*");
        }
    }

    public void square(){
        for(int a=0;a<8;a++){
            for (int b=0;b<=7;b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public void numbers(){
        for (int c=0;c<6;c++){
            for(int d=1;d<=c;d++){
                System.out.print(d);
            }
            System.out.println();
        }
    }

    public void abc(){
         int  num=65;
         int num2=66;
        for(int l=0;l<6;l++){
            for(int k=0;k<=l;k++){
                System.out.print(num+num2);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Pattern obj=new Pattern();
        obj.main();
        obj.square();
//        System.out.println();
        obj.numbers();
        obj.abc();
    }

}
