package com.Zffr.Conditional_Statement;

public class PT {
//    public void square(){
//        for (int i=1;i<=4;i++){
//            for(int j=0;j<=5;j++) {
//                System.out.print("*");          //Square Pattern
//            }
//            System.out.println();
//        }
//    }

//    public void  rectangle(){
//        for (int p=1;p<=4;p++){
//            for(int q=0;q<=12;q++) {
//                System.out.print("*");             //Rectangle Pattern
//            }
//            System.out.println();
//        }
//    }

//    public void righttriange(){
//        for(int a=0;a<=6;a++){
//            for(int b=0;b<=a;b++)
//            {
//                System.out.print("*");               //Right Triangle
//            }
//            System.out.println();
//        }
//    }

//    public void rightdowntriange(){
//        for(int a=0;a<=6;a++){
//            for(int b=6;b>a;b--)
//            {
//                System.out.print("*");               //Right-Down Triangle
//            }
//            System.out.println();
//        }
//    }

//   public void priting123(){
//       for (int i=1;i<=6;i++){
//           for (int j=1;j<=i;j++){
//               System.out.print(j);
//           }
//           System.out.println();
//       }
//   }

   public void printabc(){
       char num1='A';
       char num2='B';

       for(int a=0;a<=8;a++){
           for(int s=1;s<=a;s++){
               System.out.print(num1);
           }

           System.out.println();
       }
   }


    public static void main(String[] args) {
        PT obj=new PT();
//        obj.square();
//        obj.rectangle();
//        obj.righttriange();
//        obj.rightdowntriange();

//        obj.priting123();
        obj.printabc();

    }
}
