package com.Code_with_Harry;

public class Cwh_27_ForEach {



//    Printing an Array using For loop

//public static void main(String[] args) {
//    int []marks={23,67,89,56,45};
//    for(int i=0;i<marks.length;i++){
//        System.out.print(marks[i]);
//    }
//}

//    Printing an Array In Reverse Order

//    public static void main(String[] args) {
//        int []list={23,67,54,34,89,90};
//        for(int i= list.length-1;i>= 0;i--){
//            System.out.print(list[i]);
//        }
//    }


//    Printing an Array using Foreach Loop
//public static void main(String[] args) {
//   int[] list={34,56,76,89,50};
//   for(int element:list){
//       System.out.println(element);
//   }

//    Printing even numbers of an Array

    public static void main(String[] args) {
        int []marks={2,3,7,6,8,9,13};
       for(int i=0;i< marks.length;i++){
           if(marks[i] %2==0){
               System.out.print(marks[i]);
           }
       }

}

}
