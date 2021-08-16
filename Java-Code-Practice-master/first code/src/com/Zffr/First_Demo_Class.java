package com.Zffr;

public class First_Demo_Class {

  static   byte a=11;

//    Static Function --------------------------

    public static void main() {
        System.out.println("Static Method");
    }



//  Instance Function -------------

    public  void second() {
        System.out.println("Instance Method");
    }

//-------------------------------------

    public int sub(){
        return  2000;
    }

    public  byte say(){
        return 22;
    }

//    -------------------
    public static void main(String[] args) {
        First_Demo_Class.main();                       // Printing Static Method

        First_Demo_Class obj=new First_Demo_Class();  //Printing Instance  Method line 1
        obj.second();                                 //Printing Instance  Method line 2

        System.out.println(First_Demo_Class.a);


//        int sub= obj.sub();
        System.out.println(obj.sub());                //printing integer
        System.out.println(obj.say());                //printing Byte
    }

}
