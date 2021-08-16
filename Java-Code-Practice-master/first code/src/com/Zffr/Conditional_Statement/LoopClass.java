package com.Zffr.Conditional_Statement;

public class LoopClass {

    public void display(){
        for (int i=1;i<=5;i++){                       //For Loop    Increment
            System.out.println(i);
        }
    }
//
//    public void display2(){
//        for(int j=10;j>=1;j--){                        //For Loop Decrement
//            System.out.print(" "+j);
//        }
//    }


//    public void whileloop(){
//        int k=1;
//        while (k<=5){
//            System.out.print(" "+ k);                      //While Loop Syntax
//            k++;
//        }
//    }

//    public void dowileloop(){
//        int l=0;                                 //Do-wile Loop
//        do{
//            System.out.println(l);
//            l++;
//        }
//        while (l>1);{
//            System.out.println(l);
//        }
//    }




    public static void main(String[] args) {
        LoopClass obj=new LoopClass();
        obj.display();
//        obj.display2();
//        obj.whileloop();
//        obj.dowileloop();
    }
}
