package com.Zffr.Conditional_Statement;



public class If_Else_Elseif {
    //    public void First(int age){
//        if(age>=18){
//            System.out.println("You are allowed");
//        }
//        else if(age==17){
//            System.out.println("You can apply after Next Year");
//        }
//        else{
//            System.out.println("You are not allowed");
//        }
//    }
//
//    public static void main(String[] args) {
//        Conditional_Statement obj=new Conditional_Statement();
//        obj.First(17);
//    }

//    public void Check(int num1,int num2){
//        if(num1>num2){
//            System.out.println("num1 is greater then num2");
//        }
//        else if(num1<num2){
//            System.out.println("Num2 is greater then Num1");
//        }
//        else if(num1==num2){
//            System.out.println("Both are equal");
//        }
//        else{
//            System.out.println("Wrong statement");
//        }
//    }

    public void eligibe(int age){
        if(age>18){
            System.out.printf("YOu can drive");
        }
        else{
            System.out.printf("You cannot drive");
        }
    }


    public static void main(String[] args) {
        If_Else_Elseif obj=new If_Else_Elseif();
        obj.eligibe(18);
//       If_Else_Elseif obj2=new If_Else_Elseif();
//       obj2.Check(3,4);
    }

}

