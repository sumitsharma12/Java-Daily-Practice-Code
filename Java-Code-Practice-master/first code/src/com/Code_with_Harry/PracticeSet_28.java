package com.Code_with_Harry;

public class PracticeSet_28 {

//    Question 1
//    Calculate an array add

//    public static void main(String[] args) {
//    float [] marks={22.3f,56.76f,23.45f,89.67f,56.54f};
//        float sum=0;
//       for(float element:marks){
//           sum=sum+element;
//       }
//        System.out.println(sum);
//    }

//    Question 2
//    Find max number
public static void main(String[] args) {
    int[] marks = {22, 56, 32, 87};
    int max = 0;
for(int i=0;i<marks.length;i++){
    if(marks[i]>max){
        max=marks[i];

    }
}
    System.out.println(max);
}
}
